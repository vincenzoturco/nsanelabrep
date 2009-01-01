package org.nsanelab.dandy.xml.iface;



public interface ICompMetadata {

	/**
	 * @return    Returns the dcData.
	 * @uml.property   name="dcData"
	 * @uml.associationEnd   inverse="iCompMetadata:org.nsanelab.dandy.xml.iface.IBaseCompDefinition"
	 * @uml.association   name="dcData"
	 */
	public IBaseCompDefinition getDcData();

	/**
	 * Setter of the property <tt>dcData</tt>
	 * @param dcData  The dcData to set.
	 * @uml.property  name="dcData"
	 */
	public void setDcData(IBaseCompDefinition dcData);

	/**
	 * @return    Returns the sharingDependencies.
	 * @uml.property   name="iSharingDependency"
	 * @uml.associationEnd   multiplicity="(0 -1)" dimension="1" ordering="true" container="org.nsanelab.dandy.xml.ISharingDependency[]" inverse="iCompMetadata:org.nsanelab.dandy.xml.iface.ISharingDependency"
	 */
	public ISharingDependency[] getISharingDependencies();

	/**
	 * Setter of the property <tt>iSharingDependency</tt>
	 * @param iSharingDependency  The sharingDependencies to set.
	 * @uml.property  name="iSharingDependency"
	 */
	public void setISharingDependencies(ISharingDependency[] sharingDependency);

}
