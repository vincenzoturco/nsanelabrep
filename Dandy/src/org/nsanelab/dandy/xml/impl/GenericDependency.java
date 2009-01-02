package org.nsanelab.dandy.xml.impl;

import org.nsanelab.dandy.domain.EDependencyTime;

/**
 * @author   vin
 */
public class GenericDependency {
	//private DependencyType type;
	/**
	 * @uml.property  name="dc_ref"
	 * @uml.associationEnd  
	 */
	private BaseCompDefinition dc_ref;
	private String pp_ref;
	/**
	 * @uml.property  name="dependencyType"
	 * @uml.associationEnd  
	 */
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
	/**
	 * @return
	 * @uml.property  name="dc_ref"
	 */
	public BaseCompDefinition getDc_ref() {
		return dc_ref;
	}

	/* (non-Javadoc)
	 * @see org.nsanelab.dandy.xml.IGenericDependency#setDc_ref(org.nsanelab.dandy.xml.IBaseCompDefinition)
	 */
	/**
	 * @param dc_ref
	 * @uml.property  name="dc_ref"
	 */
	public void setDc_ref(BaseCompDefinition dc_ref) {
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
	/**
	 * @return
	 * @uml.property  name="pp_ref"
	 */
	public String getPp_ref() {
		return pp_ref;
	}

	/* (non-Javadoc)
	 * @see org.nsanelab.dandy.xml.IGenericDependency#setPp_ref(java.lang.String)
	 */
	/**
	 * @param pp_ref
	 * @uml.property  name="pp_ref"
	 */
	public void setPp_ref(String pp_ref) {
		this.pp_ref = pp_ref;
	}
	

	/* (non-Javadoc)
	 * @see org.nsanelab.dandy.xml.IGenericDependency#getDependencyType()
	 */
	/**
	 * @return
	 * @uml.property  name="dependencyType"
	 */
	public EDependencyTime getDependencyType() {
		return dependencyType;
	}

	/* (non-Javadoc)
	 * @see org.nsanelab.dandy.xml.IGenericDependency#setDependencyType(org.nsanelab.dandy.domain.EDependencyTime)
	 */
	/**
	 * @param dependencyType
	 * @uml.property  name="dependencyType"
	 */
	public void setDependencyType(EDependencyTime dependencyType) {
		this.dependencyType = dependencyType;
	}



	
}
