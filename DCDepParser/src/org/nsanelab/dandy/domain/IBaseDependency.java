package org.nsanelab.dandy.domain;


public interface IBaseDependency {

	/**
	 * @return  Returns the src.
	 * @uml.property  name="src"
	 */
	public IGenericComp getSrc();

	/**
	 * Setter of the property <tt>src</tt>
	 * @param src  The src to set.
	 * @uml.property  name="src"
	 */
	public void setSrc(IGenericComp src);

	/**
	 * @return  Returns the tgt.
	 * @uml.property  name="tgt"
	 */
	public IGenericComp getTgt();

	/**
	 * Setter of the property <tt>tgt</tt>
	 * @param tgt  The tgt to set.
	 * @uml.property  name="tgt"
	 */
	public void setTgt(IGenericComp tgt);

	/**
	 * @return  Returns the info.
	 * @uml.property  name="info"
	 */
	public IDependencyInfo getInfo();

	/**
	 * Setter of the property <tt>info</tt>
	 * @param info  The info to set.
	 * @uml.property  name="info"
	 */
	public void setInfo(IDependencyInfo info);

}
