package org.nsanelab.dandy.xml.iface;

/**
 * @author  vin
 */
public interface IDependencyAggregation {

	public abstract String toString();

	/**
	 * @return  Returns the dependencies.
	 * @uml.property  name="dependencies"
	 * @uml.associationEnd  multiplicity="(0 -1)" dimension="1" ordering="true" container="org.nsanelab.dandy.xml.iface.IGenericDependency[]" inverse="iDependencyAggregation:org.nsanelab.dandy.xml.iface.IGenericDependency"
	 */
	public abstract IGenericDependency[] getDependency();

	/**
	 * Setter of the property <tt>dependencies</tt>
	 * @param dependencies  The dependencies to set.
	 * @uml.property  name="dependencies"
	 */
	public abstract void setDependency(IGenericDependency[] dependency);

	
	

}