package org.nsanelab.dandy.xml.iface;

/**
 * @author  vin
 */
public interface IGenericCompDefinition extends IBaseCompDefinition {

	public abstract String toString();

	/**
	 * Getter of the property <tt>dependencies</tt>
	 * @return   Returns the dependencies.
	 * @uml.property  name="dependencies"
	 * @uml.associationEnd  
	 */
	public abstract IDependencyAggregation getDependencies();

	/**
	 * Setter of the property <tt>dependencies</tt>
	 * @param dependencies   The dependencies to set.
	 * @uml.property  name="dependencies"
	 */
	public abstract void setDependencies(IDependencyAggregation dependencies);

}