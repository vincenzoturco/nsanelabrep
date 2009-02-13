/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.usecase.impl;

import edu.uci.ics.jung.graph.DirectedGraph;
import java.util.Collection;
import java.util.LinkedHashSet;
import org.nsanelab.dandy.domain.iface.IBaseDependency;
import org.nsanelab.dandy.domain.iface.ICycleFinderFactory;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.usecase.iface.ICycleFinder;
import org.nsanelab.dandy.domain.impl.CycleFinder;
import org.nsanelab.dandy.exceptions.GraphTraversalException;
import org.nsanelab.dandy.utils.DependencyCycle;

/**
 *
 * @author I044892
 */
public class GraphCycleFinder {

    private DirectedGraph<IGenericComp, IBaseDependency> graph;
    private Collection<IGenericComp> vertices;
    private Collection<IGenericComp> visited;
    private Collection<DependencyCycle> detectedCycles;
    private ICycleFinderFactory finderCreatorDelegate;

    public GraphCycleFinder(DirectedGraph<IGenericComp, IBaseDependency> graph, ICycleFinderFactory creator) {
        this.graph = graph;
        this.detectedCycles = new LinkedHashSet<DependencyCycle>();
        this.finderCreatorDelegate = creator;

    }

    public Collection<DependencyCycle> getDetectedCycles() {
        return detectedCycles;
    }

    public void setDetectedCycles(Collection<DependencyCycle> detectedCycles) {
        this.detectedCycles = detectedCycles;
    }

    /**
     * Looks for cycles in the graph set in the instance variable <b>graph</b>.
     * Disconnected graphs are handled as well.
     * @throws org.nsanelab.dandy.exceptions.GraphTraversalException
     */
    public void doCycleSearch() throws GraphTraversalException {

        this.vertices = new LinkedHashSet<IGenericComp>(graph.getVertices());
        this.visited = new LinkedHashSet<IGenericComp>();

        IGenericComp tmpComp;
        ICycleFinder cycleFinder;

        while (!this.vertices.isEmpty()) {
            System.out.println("esecuzione cyclefinder - elementi da visit.: "+this.vertices);
            tmpComp = this.vertices.iterator().next();
            cycleFinder = this.finderCreatorDelegate.create();
            cycleFinder.setGraph(this.graph);
            cycleFinder.visit(tmpComp);
            this.detectedCycles.addAll(cycleFinder.getFoundCycles());
            this.vertices.removeAll(cycleFinder.getVisitedSubtree());
            this.vertices.remove(tmpComp);
            System.out.println("sottoalbero visitato: "+cycleFinder.getVisitedSubtree());
        }

    }

    private void computeDelta(Collection<IGenericComp> visited) {
        this.vertices.removeAll(visited);
    }
}
