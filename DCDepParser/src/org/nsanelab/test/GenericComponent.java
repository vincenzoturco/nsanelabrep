package org.nsanelab.test;

/**
 * @author  vin
 */
public class GenericComponent extends BaseComponent{

/**
 * @uml.property  name="dependencies"
 * @uml.associationEnd  
 */
private DependencyAggregation dependencies;

/**
 * @return
 * @uml.property  name="dependencies"
 */
public DependencyAggregation getDependencies() {
	return dependencies;
}

/**
 * @param dependencies
 * @uml.property  name="dependencies"
 */
public void setDependencies(DependencyAggregation dependencies) {
	this.dependencies = dependencies;
}

@Override
public String toString() {
	
	return super.toString();//+"; deps: "+this.dependencies.toString();
}



}
