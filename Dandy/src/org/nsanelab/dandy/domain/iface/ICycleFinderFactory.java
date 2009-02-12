/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.domain.iface;

import org.nsanelab.dandy.usecase.iface.ICycleFinder;

/**
 *
 * @author I044892
 */
public interface ICycleFinderFactory {

    ICycleFinder create();

    String getImplementation();

    void setImplementation(String implementation);

}
