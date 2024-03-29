package org.nsanelab.dandy.xml.impl;

import org.nsanelab.dandy.xml.iface.IDependencyAggregation;
import org.nsanelab.dandy.xml.iface.IGenericDependency;


/**
 * @author   vin
 */
public class DependencyAggregation {


public DependencyAggregation(){
	this.dependency = new GenericDependency[0];
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
/**
 * @return
 * @uml.property  name="dependency"
 */
public GenericDependency[] getDependency() {
	return dependency;
}





/**
 * Getter of the property <tt>dependency</tt>
 * @return   Returns the dependency.
 * @uml.property  name="dependency"
 * @uml.associationEnd  multiplicity="(0 -1)"
 */
private GenericDependency[] dependency;


/* (non-Javadoc)
 * @see org.nsanelab.dandy.xml.IDependencyAggregation#setDependency(org.nsanelab.dandy.xml.IGenericDependency[])
 */
/**
 * @param dependency
 * @uml.property  name="dependency"
 */
public void setDependency(GenericDependency[] dependency) {
	this.dependency = dependency;
}





}
