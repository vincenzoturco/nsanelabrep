/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.utils;

import org.nsanelab.dandy.domain.EDependencyTime;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.domain.impl.GenericComp;

/**
 *
 * @author I044892
 */
public class DependencyCycle extends ComponentPath {
    private EDependencyTime depType;

    public EDependencyTime getDepType() {
        return depType;
    }

    public void setDepType(EDependencyTime depType) {
        this.depType = depType;
    }
    
    /**
     * Constructor with package scope
     */
    DependencyCycle() {
        super();
        this.depType = EDependencyTime.unspecified;

    }

    public DependencyCycle(ComponentPath param) {
        super(param);
        
    }
}
