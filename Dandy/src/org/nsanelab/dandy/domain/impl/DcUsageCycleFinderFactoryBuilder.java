/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.domain.impl;

import org.nsanelab.dandy.domain.iface.ICycleFinderFactory;

/**
 *
 * @author I044892
 */
public class DcUsageCycleFinderFactoryBuilder {

    private static ICycleFinderFactory factoryInst;
    private static final String factoryImplPath = "org.nsanelab.dandy.domain.impl.CycleFinderFactory";
    private static final String detectorPath = "org.nsanelab.dandy.usecase.impl.DCDepCycleFinder";
   
    public ICycleFinderFactory factoryInstance() {
		if(factoryInst == null){
			initFactoryInstance();
		}

		return factoryInst;
	}

	private void initFactoryInstance(){
		try {
			Class factoryClass;

			factoryClass = Class.forName(factoryImplPath);
			factoryInst = (ICycleFinderFactory)factoryClass.newInstance();
            factoryInst.setImplementation(detectorPath);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
