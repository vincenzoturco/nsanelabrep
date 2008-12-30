package org.nsanelab.dandy.xml;

/**
 * @author  vin
 */
public class GenericCompDefinition extends BaseCompDefinition{

	public GenericCompDefinition(){
		super();
		this.dependencies = new DependencyAggregation();
	}
	
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
	if(dependencies!=null){
	this.dependencies = dependencies;
	}
	
}

@Override
public String toString() {
	
	return super.toString();//+"; deps: "+this.dependencies.toString();
}



}
