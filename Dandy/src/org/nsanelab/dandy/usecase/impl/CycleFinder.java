/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.usecase.impl;

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

    private ComponentPath visitedComponents;
    private LinkedHashSet<DependencyCycle> foundCycles;

    public LinkedHashSet<DependencyCycle> getFoundCycles() {
        return foundCycles;
    }

    public void setFoundCycles(LinkedHashSet<DependencyCycle> foundCycles) {
        this.foundCycles = foundCycles;
    }

    public ComponentPath getVisitedComponents() {
        return visitedComponents;
    }

    public void setVisitedComponents(ComponentPath visitedComponents) {
        this.visitedComponents = visitedComponents;
    }

    public CycleFinder() {
        this.visitedComponents = new ComponentPath();
        this.foundCycles = new LinkedHashSet<DependencyCycle>();

    }

    public CycleFinder(ComponentPath comps) {
        this.visitedComponents = comps;
        this.foundCycles = new LinkedHashSet<DependencyCycle>();
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

            depIter = node.getOutDep().iterator();

            while (depIter.hasNext()) {
                cycleFnd = new CycleFinder(this.visitedComponents);
                //recursive step
                cycleFnd.visit(depIter.next().getTgt());
                this.foundCycles.addAll(cycleFnd.getFoundCycles());
               
            }

        }
    }
}
