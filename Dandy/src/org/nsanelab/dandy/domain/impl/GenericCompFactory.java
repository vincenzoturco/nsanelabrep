package org.nsanelab.dandy.domain.impl;

import java.util.ArrayList;

import org.nsanelab.dandy.domain.EDependencyTime;
import org.nsanelab.dandy.domain.iface.IBaseDependency;
import org.nsanelab.dandy.domain.iface.IDependencyInfo;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.domain.iface.IGenericCompFactory;
import org.nsanelab.dandy.domain.iface.ISharingDependency;
import org.nsanelab.dandy.domain.iface.IUDCDependency;
import org.nsanelab.dandy.xml.iface.ICompMetadata;
import org.nsanelab.dandy.xml.iface.IGenericDependency;
import org.nsanelab.dandy.xml.impl.BaseCompDefinition;
import org.nsanelab.dandy.xml.impl.GenericCompDefinition;
import org.nsanelab.dandy.xml.impl.GenericDependency;

public class GenericCompFactory implements IGenericCompFactory {

	private static final String genericCompImpl = "org.nsanelab.dandy.domain.impl.GenericComp";
	private static final String genericDepImpl = "org.nsanelab.dandy.domain.impl.UDCDependency";
	private static final String sharedDepImpl = "org.nsanelab.dandy.domain.impl.SharingDependency";
	private static final String depInfoImpl = "org.nsanelab.dandy.domain.impl.DependencyInfo";

	@Override
	public IGenericComp create(ICompMetadata compMetadata) {
		IGenericComp newComp = null;
		ArrayList<IBaseDependency> allDeps;
		try {
			newComp = (IGenericComp) Class.forName(genericCompImpl)
					.newInstance();
			allDeps = xmlDep2DomainDep(compMetadata.getDcData(), newComp);
			allDeps.addAll(xmlSharedDep2DomainSharedDep(compMetadata.getSharingDependencies(),newComp));
			newComp.setOutDep(allDeps);
			newComp.setName(compMetadata.getDcData().getName());
			newComp.setVendor(compMetadata.getDcData().getVendor());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception exc){
			exc.printStackTrace();
		}

	

		return newComp;
	}

	private ArrayList<IBaseDependency> xmlDep2DomainDep(
			GenericCompDefinition compDef, IGenericComp owner) throws ClassNotFoundException, Exception{
		//var decl
		ArrayList<IBaseDependency> arrayOut;
		GenericDependency[] xmlDeps;
		
		Class genDepClass, depInfoClass, baseCompClass;
		IUDCDependency genDep;
		IDependencyInfo depInfo;
		IGenericComp genericComp;
		
		BaseCompDefinition tmpComp;
		//end decl
		
		arrayOut = new ArrayList<IBaseDependency>();
		genDepClass = Class.forName(genericDepImpl);
		depInfoClass = Class.forName(depInfoImpl);
		baseCompClass = Class.forName(genericCompImpl);

		xmlDeps = compDef.getDependencies().getDependency();

		for (int i = 0; i < xmlDeps.length; i++) {
			genDep = (IUDCDependency) genDepClass.newInstance();
			depInfo = (IDependencyInfo) depInfoClass.newInstance();
			genericComp = (IGenericComp) baseCompClass.newInstance();
			
			tmpComp = xmlDeps[i].getDc_ref();
			genericComp.setName(tmpComp.getName().replaceAll("~", "/"));
			genericComp.setVendor(tmpComp.getVendor());
			
			depInfo.setDepTime(EDependencyTime.build);
			depInfo.setPublicPart(xmlDeps[i].getPp_ref()!=null?xmlDeps[i].getPp_ref():"N/A");
			
			genDep.setInfo(depInfo);
			genDep.setTgt(genericComp);
			genDep.setSrc(owner);
						
			arrayOut.add(genDep);
		}
		return arrayOut;
	}

	private ArrayList<IBaseDependency> xmlSharedDep2DomainSharedDep(
			org.nsanelab.dandy.xml.impl.SharingDependency[] sharDep, IGenericComp owner) throws ClassNotFoundException, Exception {
		//var decl
		ArrayList<IBaseDependency> arrayOut;
			
		Class genDepClass, depInfoClass, baseCompClass;
		ISharingDependency genDep;
		IDependencyInfo depInfo;
		IGenericComp genericComp;
		
		BaseCompDefinition tmpComp;
		//end decl
		
		arrayOut = new ArrayList<IBaseDependency>();
		genDepClass = Class.forName(sharedDepImpl);
		depInfoClass = Class.forName(depInfoImpl);
		baseCompClass = Class.forName(genericCompImpl);

	
		for (int i = 0; i < sharDep.length; i++) {
			genDep = (ISharingDependency) genDepClass.newInstance();
			depInfo = (IDependencyInfo) depInfoClass.newInstance();
			genericComp = (IGenericComp) baseCompClass.newInstance();
			
			tmpComp = sharDep[i].getIBaseCompDefinition();
			
			genericComp.setName(tmpComp.getName().replaceAll("~", "/"));
			genericComp.setVendor(tmpComp.getVendor());
			
			depInfo.setDepTime(EDependencyTime.run);
			depInfo.setPublicPart("N/A");
			
			genDep.setInfo(depInfo);
			genDep.setTgt(genericComp);
			genDep.setSrc(owner);
			
			arrayOut.add(genDep);
		}
		return arrayOut;
	}

}
