package org.nsanelab.dandy.xml.impl;

import org.nsanelab.dandy.xml.iface.IBaseCompDefinition;
import org.nsanelab.dandy.xml.iface.ISharingDependency;


public class SharingDependency implements ISharingDependency {
	
	private BaseCompDefinition baseComp;
	@Override
	public BaseCompDefinition getIBaseCompDefinition() {
		return this.baseComp;
	}

	@Override
	public void setIBaseCompDefinition(BaseCompDefinition baseCompDefinition) {
		this.baseComp = baseCompDefinition;

	}

}
