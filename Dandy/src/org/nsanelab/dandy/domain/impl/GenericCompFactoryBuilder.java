package org.nsanelab.dandy.domain.impl;

import org.nsanelab.dandy.domain.iface.IGenericCompFactory;
import org.nsanelab.dandy.domain.iface.IGenericCompFactoryBuilder;


public class GenericCompFactoryBuilder implements IGenericCompFactoryBuilder {

	private static IGenericCompFactory factoryInst = null;
	private static final String factoryImplPath = "org.nsanelab.dandy.domain.impl.GenericCompFactory"; 
	
	@Override
	public IGenericCompFactory factoryInstance() {
		if(factoryInst == null){
			initFactoryInstance();
		}
		
		return factoryInst;
	}
	
	private void initFactoryInstance(){
		try {
			Class factoryClass;
			
			factoryClass = Class.forName(factoryImplPath);
			factoryInst = (IGenericCompFactory)factoryClass.newInstance();
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
