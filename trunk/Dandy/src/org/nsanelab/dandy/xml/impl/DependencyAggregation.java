package org.nsanelab.dandy.xml.impl;

import org.nsanelab.dandy.xml.iface.IDependencyAggregation;
import org.nsanelab.dandy.xml.iface.IGenericDependency;


/**
 * @author  vin
 */
public class DependencyAggregation implements IDependencyAggregation {


public DependencyAggregation(){
	this.dependency = new IGenericDependency[0];
}


/* (non-Javadoc)
 * @see org.nsanelab.dandy.xml.IDependencyAggregation#toString()
 */
@Override
public String toString() {
	String retVal = "";
		
for(int i=0;i<this.dependency.length;i++){
	retVal+="; "+this.dependency[i].toString();
}
	return retVal;

}

/* (non-Javadoc)
 * @see org.nsanelab.dandy.xml.IDependencyAggregation#getDependency()
 */
public IGenericDependency[] getDependency() {
	return dependency;
}





/** 
 * Getter of the property <tt>dependency</tt>
 * @return  Returns the dependency.
 * @uml.property name="dependency"
 * @uml.associationEnd multiplicity="(0 -1)" inverse="dependencyAggregation:org.nsanelab.dandy.xml.GenericDependency"
 * @uml.association name="dependency"
 */
private IGenericDependency[] dependency;


/* (non-Javadoc)
 * @see org.nsanelab.dandy.xml.IDependencyAggregation#setDependency(org.nsanelab.dandy.xml.IGenericDependency[])
 */
public void setDependency(IGenericDependency[] dependency) {
	this.dependency = dependency;
}





}
