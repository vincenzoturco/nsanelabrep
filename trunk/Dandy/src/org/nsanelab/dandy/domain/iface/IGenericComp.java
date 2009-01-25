package org.nsanelab.dandy.domain.iface;

import java.util.Collection;

import org.nsanelab.dandy.usecase.iface.IUIGraph;


public interface IGenericComp extends IBaseComp {

	/**
	 * @return  Returns the outDep.
	 * @uml.property  name="outDep"
	 */
	public Collection<IBaseDependency> getOutDep();

	/**
	 * Setter of the property <tt>outDep</tt>
	 * @param outDep  The outDep to set.
	 * @uml.property  name="outDep"
	 */
	public void setOutDep(Collection<IBaseDependency> outDep);

	/**
	 * @return  Returns the inDep.
	 * @uml.property  name="inDep"
	 */
	public Collection<IBaseDependency> getInDep();

	/**
	 * Setter of the property <tt>inDep</tt>
	 * @param inDep  The inDep to set.
	 * @uml.property  name="inDep"
	 */
	public void setInDep(Collection<IBaseDependency> inDep);



}
