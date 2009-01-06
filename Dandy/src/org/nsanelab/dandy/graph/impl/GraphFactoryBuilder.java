/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.graph.impl;

import org.nsanelab.dandy.graph.iface.IGraphFactory;
import org.nsanelab.dandy.graph.iface.IGraphFactoryBuilder;

/**
 *
 * @author vin
 */
public class GraphFactoryBuilder implements IGraphFactoryBuilder {

    private static IGraphFactory factoryInstance = null;
    private static final String factoryImplPath = "org.nsanelab.dandy.graph.impl.GraphFactory";

    public IGraphFactory factoryInstance() throws ClassNotFoundException,
            IllegalAccessException, InstantiationException {
        if (factoryInstance == null) {
            Class factClass = Class.forName(factoryImplPath);
            factoryInstance = (IGraphFactory) factClass.newInstance();
        }
        return factoryInstance;
    }
}
