package org.nsanelab.prototypes;

/**
 * @author  vin
 */
public class GenericComponent extends BaseComponent{

	public GenericComponent(){
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
