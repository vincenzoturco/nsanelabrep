/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.usecase.iface;

import edu.uci.ics.jung.graph.DirectedGraph;
import java.util.LinkedHashSet;
import org.nsanelab.dandy.domain.iface.IBaseDependency;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.domain.iface.IGraphVisitor;
import org.nsanelab.dandy.utils.ComponentPath;
import org.nsanelab.dandy.utils.DependencyCycle;

/**
 *
 * @author I044892
 */
public interface ICycleFinder extends IGraphVisitor {

    /**
     * Lists the found graph cycles.
     * @return the cycle list
     */
    public LinkedHashSet<DependencyCycle> getFoundCycles();

    public void setFoundCycles(LinkedHashSet<DependencyCycle> par);

    /**
     * Lists all the visited nodes reached starting from this node
     * @return the list of nodes visited during the graph traversal this node was involved in
     */
    public LinkedHashSet<IGenericComp> getVisitedSubtree();

    public void setGraph(DirectedGraph<IGenericComp, IBaseDependency> graph);

    public void setVisitedComponents(ComponentPath visitedComponents);
    public ComponentPath getVisitedComponents();
}
