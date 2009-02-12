/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.utils;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.nsanelab.dandy.domain.iface.IGenericComp;

/**
 *
 * @author I044892
 */
public class DependencyCycleFactory {

    public DependencyCycle create(ComponentPath path, IGenericComp duplicateComp) throws IllegalArgumentException {
        Collection toRemove;
        DependencyCycle retVal;
        Iterator<IGenericComp> pathIter;
        ComponentPath newPath;
        IGenericComp temp;
        boolean notFound = true;

        toRemove = new LinkedHashSet();
        pathIter = path.iterator();

        while (pathIter.hasNext()) {
            temp = pathIter.next();
            if (!temp.equals(duplicateComp)) {
                toRemove.add(temp);
            } else {
                notFound = false;
                break;
            }
        }

        if (notFound) {
            throw new IllegalArgumentException("The path provided (" + path + ") does not contain the specified element (" + duplicateComp + ")");
        }

        newPath = (ComponentPath) path.clone();

        newPath.removeAll(toRemove);
        retVal = new DependencyCycle(newPath);

        return retVal;
    }
}
