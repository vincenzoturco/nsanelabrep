/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.domain.impl;

import edu.uci.ics.jung.graph.DirectedGraph;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.util.Pair;
import java.awt.Component;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.nsanelab.dandy.domain.iface.IBaseDependency;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.exceptions.CycleDetectionException;
import org.nsanelab.dandy.usecase.iface.ICycleFinder;
import org.nsanelab.dandy.utils.ComponentPath;
import org.nsanelab.dandy.utils.DependencyCycle;
import org.nsanelab.dandy.utils.DependencyCycleFactory;

/**
 *
 * @author I044892
 */
public abstract class CycleFinder implements ICycleFinder {

    public DirectedGraph<IGenericComp, IBaseDependency> getGraph() {
        return graph;
    }

    @Override
    public void setGraph(DirectedGraph<IGenericComp, IBaseDependency> graph) {
        this.graph = graph;
    }
    //path of the node reached by the CycleFinder instance which created this instance
    //Empty for graph traversal root node
    private ComponentPath visitedComponents;
    //list of found cyclic dependencies
    private LinkedHashSet<DependencyCycle> foundCycles;
    //list of all the nodes found in the graph subtree rooted in the node passed to this.visit()
    //filled only upon recursive visit method execution is complete
    private DirectedGraph<IGenericComp, IBaseDependency> graph;

    //used to keep track of the nodes visited during recursion
    private LinkedHashSet<IGenericComp> visitedSubtree;

    @Override
    public LinkedHashSet<DependencyCycle> getFoundCycles() {
        return foundCycles;
    }

    @Override
    public void setFoundCycles(LinkedHashSet<DependencyCycle> foundCycles) {
        this.foundCycles = foundCycles;
    }

    @Override
    public ComponentPath getVisitedComponents() {
        return visitedComponents;
    }

    @Override
    public void setVisitedComponents(ComponentPath visitedComponents) {
        this.visitedComponents = visitedComponents;
        this.visitedSubtree = new LinkedHashSet<IGenericComp>();
        this.visitedSubtree = new LinkedHashSet<IGenericComp>();
    }

    public CycleFinder() {
        this.visitedComponents = new ComponentPath();
        this.foundCycles = new LinkedHashSet<DependencyCycle>();
        this.graph = new DirectedSparseGraph<IGenericComp, IBaseDependency>();
        this.visitedSubtree = new LinkedHashSet<IGenericComp>();

    }

    public CycleFinder(ComponentPath comps) {
        this.visitedComponents = comps;
        this.foundCycles = new LinkedHashSet<DependencyCycle>();
        this.graph = new DirectedSparseGraph<IGenericComp, IBaseDependency>();
        this.visitedSubtree = new LinkedHashSet<IGenericComp>();
    }

    public CycleFinder(DirectedGraph<IGenericComp, IBaseDependency> graph) {
        this.visitedComponents = new ComponentPath();
        this.foundCycles = new LinkedHashSet<DependencyCycle>();
        this.graph = graph;
        this.visitedSubtree = new LinkedHashSet<IGenericComp>();

    }

    @Override
    /**
     * Recursively visits the dependency subtree. Recursion is stopped if a loop is found.
     * The loop list is found in the instance variable <b>foundCycles</b>.
     * @param node the node from which graph traversal is to be started
     */
    public void visit(IGenericComp node) throws CycleDetectionException {
        boolean cycleFound;

        cycleFound = visitedComponents.contains(node);
        System.out.println("componenti visitati: " + this.visitedComponents + "; nodo esaminato: " + node);
        if (cycleFound) {
            try {
                DependencyCycle depCycle;
                depCycle = new DependencyCycleFactory().create(visitedComponents, node);
                this.foundCycles.add(depCycle);
                System.out.println("trovato CICLO: " + depCycle);
            } catch (IllegalArgumentException ex) {
                throw new CycleDetectionException(ex.getMessage());
            }


        } else {
            Iterator<IBaseDependency> depIter;
            CycleFinder cycleFnd;

            Collection coll = this.graph.getOutEdges(node);

            //update the followed path

            this.visitedComponents.add(node);
//            if (node.getName().equals("seven")) {
//                this.visitedComponents.remove(node);
//            }

            this.visitedSubtree.add(node);

            //   System.out.println("tutti gli archi: " + this.graph.getEdges());
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
                    IBaseDependency tmpEdge;
                    ComponentPath context;

                    tmpEdge = depIter.next();
                    if (this.validateEdge(tmpEdge)) {
                        //with regard to the existence of different edge types, all extending subclasses must override a method to determine which edges must be visited
                        cycleFnd = createNewInstance();
                        cycleFnd.setGraph(this.graph);
                        context = new ComponentPath();
                        context.addAll(this.visitedComponents);
                        cycleFnd.setVisitedComponents(context);
                        //recursive step
                        Pair<IGenericComp> pair = this.graph.getEndpoints(tmpEdge);
                        System.out.println("lancio ricorsivo da: " + node + " verso " + pair.getSecond());
                        cycleFnd.visit(pair.getSecond());
                        this.foundCycles.addAll(cycleFnd.getFoundCycles());

                        //let's keep track of the nodes visited by the recursive steps
                        this.visitedSubtree.addAll(cycleFnd.getVisitedSubtree());

                    }

                }
            } else {
                System.out.println("null out edges for: " + node);
            }

        }
    }

    @Override
    public LinkedHashSet<IGenericComp> getVisitedSubtree() {
        return this.visitedSubtree;
    }

    protected abstract boolean validateEdge(IBaseDependency tmpEdge);

    public abstract CycleFinder createNewInstance();
}
