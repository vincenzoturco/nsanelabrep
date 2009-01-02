package org.nsanelab.dandy.xml.impl;

import org.nsanelab.dandy.xml.iface.ICompMetadata;


public class CompMetadata implements ICompMetadata{
	
	private SharingDependency[] dependencies;
	private BaseCompDefinition compDef;
	
	@Override
	public BaseCompDefinition getDcData() {
		return compDef;
	}

	@Override
	public SharingDependency[] getSharingDependencies() {
		return dependencies;
	}

	@Override
	public void setDcData(BaseCompDefinition dcData) {
		this.compDef = dcData;
		
	}

	@Override
	public void setSharingDependencies(SharingDependency[] sharingDependency) {
		this.dependencies = sharingDependency;
		
	}

}
