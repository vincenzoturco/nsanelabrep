/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.utils;

import java.util.LinkedHashSet;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.domain.impl.GenericComp;

/**
 *
 * @author I044892
 */
public class ComponentPath extends LinkedHashSet<IGenericComp> {

    public ComponentPath() {
        super();
    }

    public ComponentPath(ComponentPath param) {
        super(param);
    }
}
