package org.nsanelab.dandy.xml.iface;



public interface ISharingDependency {

	/**
	 * @return  Returns the baseCompDefinition.
	 * @uml.property  name="iBaseCompDefinition"
	 * @uml.associationEnd  inverse="iSharingDependency:org.nsanelab.dandy.xml.iface.IBaseCompDefinition"
	 * @uml.association  name="dcInfo"
	 */
	public IBaseCompDefinition getIBaseCompDefinition();

	/**
	 * Setter of the property <tt>iBaseCompDefinition</tt>
	 * @param iBaseCompDefinition  The baseCompDefinition to set.
	 * @uml.property  name="iBaseCompDefinition"
	 */
	public void setIBaseCompDefinition(IBaseCompDefinition baseCompDefinition);

}
