package org.nsanelab.dandy.xml.impl;

import org.nsanelab.dandy.xml.iface.ICompMetadataFactory;
import org.nsanelab.dandy.xml.iface.ICompMetadataFactoryBuilder;


public class CompMetadataFactoryBuilder implements ICompMetadataFactoryBuilder {
	
	private static ICompMetadataFactory instance;
	private static final String factoryImplPath = "org.nsanelab.dandy.xml.impl.CompMetadataFactory";
	
	@Override
	public ICompMetadataFactory factoryInstance() {
	
		if(instance!=null){
		//do nothing
		}
		else{
			initInstance();
		}
	
		return instance;

		
	}
	
	
	private static void initInstance(){
		try {
			Class factoryClass;
				
			factoryClass = Class.forName(factoryImplPath);
			instance = (ICompMetadataFactory)factoryClass.newInstance();
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
