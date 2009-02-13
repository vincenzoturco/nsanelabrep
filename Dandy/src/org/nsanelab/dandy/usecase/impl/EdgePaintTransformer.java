/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.usecase.impl;

import java.awt.Color;
import java.awt.Paint;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import org.apache.commons.collections15.Transformer;
import org.nsanelab.dandy.domain.iface.IBaseDependency;
import org.nsanelab.dandy.utils.DependencyCycle;

/**
 *
 * @author I044892
 */
public class EdgePaintTransformer implements Transformer<IBaseDependency, Paint> {

    private static Hashtable<Integer, Color> colorTable;


    static {
        colorTable = new Hashtable<Integer, Color>();
        colorTable.put(new Integer(0), Color.RED);
        colorTable.put(new Integer(1), Color.GREEN);
        colorTable.put(new Integer(2), Color.PINK);
        colorTable.put(new Integer(3), Color.MAGENTA);
        colorTable.put(new Integer(4), Color.ORANGE);

    }
    Collection<DependencyCycle> cycles;

    public EdgePaintTransformer(Collection<DependencyCycle> cycles) {
        this.cycles = cycles;
    }

    @Override
    public Paint transform(IBaseDependency i) {
        Color retVal;
        boolean isInCycle = false;
        DependencyCycle depCy;
        Iterator<DependencyCycle> depCyIter;
        int cycleIndex = 0;

        depCyIter = this.cycles.iterator();
        while (depCyIter.hasNext()) {
            depCy = depCyIter.next();
            if (depCy.contains(i.getSrc()) && depCy.contains(i.getTgt())) {
                isInCycle = true;
                break;
            }
            cycleIndex++;
        }
        if (isInCycle) {
            retVal = colorTable.get(new Integer(cycleIndex));
        } else {
            retVal = Color.BLACK;
        }
        return retVal;
    }
}
