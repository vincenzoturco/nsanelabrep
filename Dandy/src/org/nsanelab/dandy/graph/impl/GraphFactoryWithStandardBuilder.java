/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.graph.impl;

import org.nsanelab.dandy.graph.iface.IGraphFactory;
import org.nsanelab.dandy.graph.iface.IGraphFactoryBuilder;

/**
 *
 * @author I044892
 */
public class GraphFactoryWithStandardBuilder implements IGraphFactoryBuilder{

    private static IGraphFactory factoryInstance = null;
    private static final String factoryImplPath = "org.nsanelab.dandy.graph.impl.GraphFactoryImpl";

    public IGraphFactory factoryInstance() {
        if (factoryInstance == null) {
            try {
                Class factClass = Class.forName(factoryImplPath);
                factoryInstance = (IGraphFactory) factClass.newInstance();
                factoryInstance.setIncludeStandard(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return factoryInstance;
    }
}
