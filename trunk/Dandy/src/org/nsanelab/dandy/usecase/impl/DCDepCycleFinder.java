/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.usecase.impl;

import edu.uci.ics.jung.graph.DirectedGraph;
import java.util.LinkedHashSet;
import org.nsanelab.dandy.domain.EDependencyTime;
import org.nsanelab.dandy.domain.iface.IBaseDependency;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.domain.impl.CycleFinder;
import org.nsanelab.dandy.utils.ComponentPath;
import org.nsanelab.dandy.utils.DependencyCycle;

/**
 *
 * @author I044892
 */
public class DCDepCycleFinder extends CycleFinder {

    public DCDepCycleFinder() {
        super();
    }

    public DCDepCycleFinder(DirectedGraph<IGenericComp, IBaseDependency> graph) {
        super(graph);
    }

    public DCDepCycleFinder(ComponentPath comps) {
        super(comps);
    }

    @Override
    protected boolean validateEdge(IBaseDependency tmpEdge) {
        return tmpEdge.getInfo().getDepTime().equals(EDependencyTime.build);
    }

    @Override
    public CycleFinder createNewInstance() {
        return new DCDepCycleFinder();
    }
}
