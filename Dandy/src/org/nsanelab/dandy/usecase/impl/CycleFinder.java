/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.usecase.impl;

import edu.uci.ics.jung.graph.DirectedGraph;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.util.Pair;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.nsanelab.dandy.domain.iface.IBaseDependency;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.usecase.iface.ICycleFinder;
import org.nsanelab.dandy.utils.ComponentPath;
import org.nsanelab.dandy.utils.DependencyCycle;

/**
 *
 * @author I044892
 */
public class CycleFinder implements ICycleFinder {

    public DirectedGraph<IGenericComp, IBaseDependency> getGraph() {
        return graph;
    }

    public void setGraph(DirectedGraph<IGenericComp, IBaseDependency> graph) {
        this.graph = graph;
    }
    private ComponentPath visitedComponents;
    private LinkedHashSet<DependencyCycle> foundCycles;
    private DirectedGraph<IGenericComp, IBaseDependency> graph;

    public LinkedHashSet<DependencyCycle> getFoundCycles() {
        return foundCycles;
    }

    public void setFoundCycles(LinkedHashSet<DependencyCycle> foundCycles) {
        this.foundCycles = foundCycles;
    }

    public ComponentPath getVisitedComponents() {
        return visitedComponents;
    }

    @Override
    public void setVisitedComponents(ComponentPath visitedComponents) {
        this.visitedComponents = visitedComponents;
    }

    public CycleFinder() {
        this.visitedComponents = new ComponentPath();
        this.foundCycles = new LinkedHashSet<DependencyCycle>();
        this.graph = new DirectedSparseGraph<IGenericComp, IBaseDependency>();

    }

    public CycleFinder(ComponentPath comps) {
        this.visitedComponents = comps;
        this.foundCycles = new LinkedHashSet<DependencyCycle>();
        this.graph = new DirectedSparseGraph<IGenericComp, IBaseDependency>();
    }

    public CycleFinder(DirectedGraph<IGenericComp, IBaseDependency> graph) {
        this.visitedComponents = new ComponentPath();
        this.foundCycles = new LinkedHashSet<DependencyCycle>();
        this.graph = graph;

    }

    @Override
    /**
     * Recursively visits the dependency subtree. Recursion is stopped if a loop is found.
     * The loop list is found in the instance variable <b>foundCycles</b>.
     * @param node the node from which graph traversal is to be started
     */
    public void visit(IGenericComp node) {
        boolean cycleFound;

        cycleFound = visitedComponents.contains(node);

        if (cycleFound) {

            DependencyCycle depCycle = new DependencyCycle(visitedComponents);
            depCycle.setRepeatedNode(node);
            this.foundCycles.add(depCycle);
        } else {
            Iterator<IBaseDependency> depIter;
            CycleFinder cycleFnd;

            Collection coll = this.graph.getOutEdges(node);

            //update the followed path
            this.visitedComponents.add(node);
            System.out.println("componenti visitati: "+this.visitedComponents);
            System.out.println("tutti gli archi: "+this.graph.getEdges());
            //outedges collection is null if not out edge is there
            if (coll != null) {
                depIter = coll.iterator();
            } else {
                depIter = null;
            }
            //to prevent null pointers, we iterate only if the edge list is not null
            if (depIter != null) {
                while (depIter.hasNext()) {
                    //init for recursive call to CycleFinder new instance
                    cycleFnd = new CycleFinder((ComponentPath)this.visitedComponents.clone());
                    cycleFnd.setGraph(this.graph);
                    //recursive step
                    Pair<IGenericComp> pair = this.graph.getEndpoints(depIter.next());
                    cycleFnd.visit(pair.getSecond());
                    this.foundCycles.addAll(cycleFnd.getFoundCycles());

                }
            } else{
                System.out.println("null out edges for: "+node);
            }

        }
    }
}
