package org.nsanelab.dandy.domain;


public interface IDependencyInfo {

	/**
	 * @return  Returns the depTime.
	 * @uml.property  name="depTime"
	 */
	public EDependencyTime getDepTime();

	/**
	 * Setter of the property <tt>depTime</tt>
	 * @param depTime  The depTime to set.
	 * @uml.property  name="depTime"
	 */
	public void setDepTime(EDependencyTime depTime);

	/**
	 * @return  Returns the publicPart.
	 * @uml.property  name="publicPart"
	 */
	public String getPublicPart();

	/**
	 * Setter of the property <tt>publicPart</tt>
	 * @param publicPart  The publicPart to set.
	 * @uml.property  name="publicPart"
	 */
	public void setPublicPart(String publicPart);

}
