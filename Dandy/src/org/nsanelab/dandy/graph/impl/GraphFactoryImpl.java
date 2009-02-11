/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.graph.impl;

import edu.uci.ics.jung.graph.DirectedGraph;
import java.util.Collection;
import org.nsanelab.dandy.domain.iface.IBaseDependency;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.graph.iface.IGraphFactory;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import java.util.Iterator;

/**
 *
 * @author vin
 */
public class GraphFactoryImpl implements IGraphFactory {

    private boolean includeStandard;

    public boolean isIncludeStandard() {
        return includeStandard;
    }

    public void setIncludeStandard(boolean includeStandard) {
        this.includeStandard = includeStandard;
    }

    public DirectedGraph<IGenericComp, IBaseDependency> create(Collection<IGenericComp> coll) {
        DirectedGraph<IGenericComp, IBaseDependency> graph;
        Iterator<IGenericComp> iter;
        IGenericComp tmpComp = null;

        graph = new DirectedSparseGraph<IGenericComp, IBaseDependency>();
        iter = coll.iterator();
        while (iter.hasNext()) {
            tmpComp = iter.next();
            //vertices should be added if and only if:( they are standard and standard is allowed OR they are not standard ) AND the very vertex has not been addded yet
            if ((includeStandard || !tmpComp.isStandard()) && !graph.containsVertex(tmpComp)) {
                graph.addVertex(tmpComp);
            }
            //edges should be added if and only if the related vertex is already added
            if (graph.containsVertex(tmpComp)) {
                addDependenciesToGraph(tmpComp, graph);
            }


        }

        return graph;
    }

    private void addDependenciesToGraph(IGenericComp comp, DirectedGraph<IGenericComp, IBaseDependency> graph) {
        IBaseDependency dep = null;
        Collection<IBaseDependency> depColl;
        Iterator<IBaseDependency> depIter;

        depColl = comp.getOutDep();
        depIter = depColl.iterator();

        while (depIter.hasNext()) {
            dep = depIter.next();
            if (dep != null && (includeStandard || !dep.getTgt().isStandard()) && (includeStandard || !dep.getSrc().isStandard()) && !graph.containsEdge(dep)) {
                graph.addEdge(dep, comp, dep.getTgt());
            }
        }



    }
}
