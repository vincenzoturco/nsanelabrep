package org.nsanelab.dandy.xml.impl;

import org.nsanelab.dandy.xml.iface.IDependencyAggregation;
import org.nsanelab.dandy.xml.iface.IGenericCompDefinition;

/**
 * @author   vin
 */
public class GenericCompDefinition extends BaseCompDefinition {

	public GenericCompDefinition(){
		super();
		this.dependencies = new DependencyAggregation();
	}



/* (non-Javadoc)
 * @see org.nsanelab.dandy.xml.IGenericCompDefinition#toString()
 */
@Override
public String toString() {
	
	return super.toString();//+"; deps: "+this.dependencies.toString();
}







/* (non-Javadoc)
 * @see org.nsanelab.dandy.xml.IGenericCompDefinition#getDependencies()
 */
/**
 * Getter of the property <tt>dependencies</tt>
 * @return  Returns the dependencies.
 * @uml.property  name="dependencies"
 */
public DependencyAggregation getDependencies() {
	return dependencies;
}



/* (non-Javadoc)
 * @see org.nsanelab.dandy.xml.IGenericCompDefinition#setDependencies(org.nsanelab.dandy.xml.DependencyAggregation)
 */
/**
 * Setter of the property <tt>dependencies</tt>
 * @param dependencies  The dependencies to set.
 * @uml.property  name="dependencies"
 */
public void setDependencies(DependencyAggregation dependencies) {
	if (dependencies != null) {
		this.dependencies = dependencies;
	}
}







/**
 * @uml.property  name="dependencies"
 * @uml.associationEnd  inverse="genericCompDefinition:org.nsanelab.dandy.xml.iface.IDependencyAggregation"
 * @uml.association  name="dependencies"
 */
private DependencyAggregation dependencies;








}
