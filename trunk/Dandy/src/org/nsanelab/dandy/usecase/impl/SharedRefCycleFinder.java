/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.usecase.impl;

import org.nsanelab.dandy.usecase.impl.*;
import edu.uci.ics.jung.graph.DirectedGraph;
import org.nsanelab.dandy.domain.EDependencyTime;
import org.nsanelab.dandy.domain.iface.IBaseDependency;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.domain.impl.CycleFinder;
import org.nsanelab.dandy.utils.ComponentPath;

/**
 *
 * @author I044892
 */
public class SharedRefCycleFinder extends CycleFinder {

    public SharedRefCycleFinder() {
        super();
    }

    public SharedRefCycleFinder(DirectedGraph<IGenericComp, IBaseDependency> graph) {
        super(graph);
    }

    public SharedRefCycleFinder(ComponentPath comps) {
        super(comps);
    }

    @Override
    protected boolean validateEdge(IBaseDependency tmpEdge) {
        return tmpEdge.getInfo().getDepTime().equals(EDependencyTime.build);
    }

    @Override
    public CycleFinder createNewInstance() {
        return new SharedRefCycleFinder();
    }
}
