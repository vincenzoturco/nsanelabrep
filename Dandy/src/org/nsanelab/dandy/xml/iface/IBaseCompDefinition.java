package org.nsanelab.dandy.xml.iface;

/**
 * @author  vin
 */
public interface IBaseCompDefinition {

	/**
	 * @return
	 * @uml.property  name="name"
	 */
	public abstract String getName();

	/**
	 * @param  name
	 * @uml.property  name="name"
	 */
	public abstract void setName(String name);

	/**
	 * @return
	 * @uml.property  name="vendor"
	 */
	public abstract String getVendor();

	/**
	 * @param  vendor
	 * @uml.property  name="vendor"
	 */
	public abstract void setVendor(String vendor);

	public abstract String toString();

	public abstract boolean equals(Object obj);

	public abstract int hashCode();

	public abstract boolean isStandard();

}