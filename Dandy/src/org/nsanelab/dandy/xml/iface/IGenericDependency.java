package org.nsanelab.dandy.xml.iface;

import org.nsanelab.dandy.domain.EDependencyTime;

public interface IGenericDependency {

	/**
	 * @return
	 * @uml.property  name="dc_ref"
	 */
	public abstract IBaseCompDefinition getDc_ref();

	/**
	 * @param dc_ref
	 * @uml.property  name="dc_ref"
	 */
	public abstract void setDc_ref(IBaseCompDefinition dc_ref);

	public abstract String toString();

	/**
	 * @return
	 * @uml.property  name="pp_ref"
	 */
	public abstract String getPp_ref();

	/**
	 * @param pp_ref
	 * @uml.property  name="pp_ref"
	 */
	public abstract void setPp_ref(String pp_ref);

	/**
	 * Getter of the property <tt>dependencyType</tt>
	 * @return  Returns the dependencyType.
	 * @uml.property  name="dependencyType"
	 */
	public abstract EDependencyTime getDependencyType();

	/**
	 * Setter of the property <tt>dependencyType</tt>
	 * @param dependencyType  The dependencyType to set.
	 * @uml.property  name="dependencyType"
	 */
	public abstract void setDependencyType(EDependencyTime dependencyType);

}