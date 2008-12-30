package org.nsanelab.dandy.xml.iface;

public interface IDependencyAggregation {

	public abstract String toString();

	/**
	 * Getter of the property <tt>dependency</tt>
	 * @return  Returns the dependency.
	 * @uml.property  name="dependency"
	 */
	public abstract IGenericDependency[] getDependency();

	/** 
	 * Setter of the property <tt>dependency</tt>
	 * @param dependency  The dependency to set.
	 * @uml.property  name="dependency"
	 */
	public abstract void setDependency(IGenericDependency[] dependency);

}