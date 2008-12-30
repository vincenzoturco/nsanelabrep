package org.nsanelab.dandy.xml.impl;

import org.nsanelab.dandy.domain.EDependencyTime;
import org.nsanelab.dandy.xml.iface.IBaseCompDefinition;
import org.nsanelab.dandy.xml.iface.IGenericDependency;

/**
 * @author  vin
 */
public class GenericDependency implements IGenericDependency {
	//private DependencyType type;
	/**
	 * @uml.property  name="dc_ref"
	 * @uml.associationEnd  
	 */
	private IBaseCompDefinition dc_ref;
	private String pp_ref;
	private EDependencyTime dependencyType;

//	public DependencyType getType() {
//		return type;
//	}

//	public void setType(DependencyType type) {
	//	this.type = type;
	//}



	/* (non-Javadoc)
	 * @see org.nsanelab.dandy.xml.IGenericDependency#getDc_ref()
	 */
	public IBaseCompDefinition getDc_ref() {
		return dc_ref;
	}

	/* (non-Javadoc)
	 * @see org.nsanelab.dandy.xml.IGenericDependency#setDc_ref(org.nsanelab.dandy.xml.IBaseCompDefinition)
	 */
	public void setDc_ref(IBaseCompDefinition dc_ref) {
		this.dc_ref = dc_ref;
	}

	/* (non-Javadoc)
	 * @see org.nsanelab.dandy.xml.IGenericDependency#toString()
	 */
	@Override
	public String toString() {
		return "("+pp_ref+")";
	}

	/* (non-Javadoc)
	 * @see org.nsanelab.dandy.xml.IGenericDependency#getPp_ref()
	 */
	public String getPp_ref() {
		return pp_ref;
	}

	/* (non-Javadoc)
	 * @see org.nsanelab.dandy.xml.IGenericDependency#setPp_ref(java.lang.String)
	 */
	public void setPp_ref(String pp_ref) {
		this.pp_ref = pp_ref;
	}
	

	/* (non-Javadoc)
	 * @see org.nsanelab.dandy.xml.IGenericDependency#getDependencyType()
	 */
	public EDependencyTime getDependencyType() {
		return dependencyType;
	}

	/* (non-Javadoc)
	 * @see org.nsanelab.dandy.xml.IGenericDependency#setDependencyType(org.nsanelab.dandy.domain.EDependencyTime)
	 */
	public void setDependencyType(EDependencyTime dependencyType) {
		this.dependencyType = dependencyType;
	}



	
}
