/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.domain.impl;

import org.nsanelab.dandy.domain.iface.ICycleFinderFactory;
import org.nsanelab.dandy.usecase.iface.ICycleFinder;

/**
 *
 * @author I044892
 */
public class CycleFinderFactory implements ICycleFinderFactory {

    public String getImplementation() {
        return implementation;
    }

    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }

    private String implementation;

    CycleFinderFactory(String implementation) {
        this.implementation = implementation;
    }

    public CycleFinderFactory() {
    }

    

    public ICycleFinder create() {

        ICycleFinder retVal = null;

        try {
            retVal = (ICycleFinder) Class.forName(implementation).newInstance();
        } catch (Exception exc) {
            //TODO
            exc.printStackTrace();
        } finally {
            return retVal;
        }
    }
}
