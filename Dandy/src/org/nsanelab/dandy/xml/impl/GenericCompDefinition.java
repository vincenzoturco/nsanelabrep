package org.nsanelab.dandy.xml.impl;

import org.nsanelab.dandy.xml.iface.IDependencyAggregation;
import org.nsanelab.dandy.xml.iface.IGenericCompDefinition;

/**
 * @author  vin
 */
public class GenericCompDefinition extends BaseCompDefinition implements IGenericCompDefinition{

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



/**
 * @uml.property  name="dependencies"
 * @uml.associationEnd  inverse="genericCompDefinition:org.nsanelab.dandy.xml.DependencyAggregation"
 * @uml.association  name="dependencies"
 */
private IDependencyAggregation dependencies;



/* (non-Javadoc)
 * @see org.nsanelab.dandy.xml.IGenericCompDefinition#getDependencies()
 */
public IDependencyAggregation getDependencies() {
	return dependencies;
}



/* (non-Javadoc)
 * @see org.nsanelab.dandy.xml.IGenericCompDefinition#setDependencies(org.nsanelab.dandy.xml.DependencyAggregation)
 */
public void setDependencies(IDependencyAggregation dependencies) {
	if (dependencies != null) {
		this.dependencies = dependencies;
	}
	
}








}
