package org.nsanelab.dandy.domain.iface;


public interface IBaseComp {

	/**
	 * @return  Returns the name.
	 * @uml.property  name="name"
	 */
	public String getName();

	/**
	 * Setter of the property <tt>name</tt>
	 * @param name  The name to set.
	 * @uml.property  name="name"
	 */
	public void setName(String name);

	/**
	 * @return  Returns the vendor.
	 * @uml.property  name="vendor"
	 */
	public String getVendor();

	/**
	 * Setter of the property <tt>vendor</tt>
	 * @param vendor  The vendor to set.
	 * @uml.property  name="vendor"
	 */
	public void setVendor(String vendor);

    public boolean isStandard();

}
