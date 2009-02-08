/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.utils;

import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.domain.impl.GenericComp;

/**
 *
 * @author I044892
 */
public class DependencyCycle extends ComponentPath {

    private IGenericComp repeatedNode;

    public DependencyCycle() {
        super();
        this.repeatedNode = null;
    }

    public DependencyCycle(ComponentPath param) {
        super(param);
        this.repeatedNode = null;
    }

    public IGenericComp getRepeatedNode() {
        return repeatedNode;
    }

    public void setRepeatedNode(IGenericComp repeatedNode) {
        this.repeatedNode = repeatedNode;
    }
    
}
