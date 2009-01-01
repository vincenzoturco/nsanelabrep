package org.nsanelab.prototypes;

/**
 * @author  vin
 */
public class GenericDependency {
	//private DependencyType type;
	/**
	 * @uml.property  name="dc_ref"
	 * @uml.associationEnd  
	 */
	private BaseComponent dc_ref;
	private String pp_ref;

//	public DependencyType getType() {
//		return type;
//	}

//	public void setType(DependencyType type) {
	//	this.type = type;
	//}



	/**
	 * @return
	 * @uml.property  name="dc_ref"
	 */
	public BaseComponent getDc_ref() {
		return dc_ref;
	}

	/**
	 * @param dc_ref
	 * @uml.property  name="dc_ref"
	 */
	public void setDc_ref(BaseComponent dc_ref) {
		this.dc_ref = dc_ref;
	}

	@Override
	public String toString() {
		return "("+pp_ref+")";
	}

	/**
	 * @return
	 * @uml.property  name="pp_ref"
	 */
	public String getPp_ref() {
		return pp_ref;
	}

	/**
	 * @param pp_ref
	 * @uml.property  name="pp_ref"
	 */
	public void setPp_ref(String pp_ref) {
		this.pp_ref = pp_ref;
	}



	
}
