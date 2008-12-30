package org.nsanelab.dandy.xml;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author  vin
 */
public class DependencyAggregation {


public DependencyAggregation(){
	this.dependency = new GenericDependency[0];
}


@Override
public String toString() {
	String retVal = "";
	GenericDependency genDep;
	
for(int i=0;i<this.dependency.length;i++){
	retVal+="; "+this.dependency[i].toString();
}
	return retVal;

}

/**
 * Getter of the property <tt>dependency</tt>
 * @return  Returns the dependency.
 * @uml.property  name="dependency"
 */
public GenericDependency[] getDependency() {
	return dependency;
}





/** 
 * Getter of the property <tt>dependency</tt>
 * @return  Returns the dependency.
 * @uml.property name="dependency"
 * @uml.associationEnd multiplicity="(0 -1)" inverse="dependencyAggregation:org.nsanelab.dandy.xml.GenericDependency"
 * @uml.association name="dependency"
 */
private GenericDependency[] dependency;


/** 
 * Setter of the property <tt>dependency</tt>
 * @param dependency  The dependency to set.
 * @uml.property  name="dependency"
 */
public void setDependency(GenericDependency[] dependency) {
	this.dependency = dependency;
}





}
