package org.nsanelab.dandy.xml;

/**
 * @author  vin
 */
public class GenericCompDefinition extends BaseCompDefinition{

	public GenericCompDefinition(){
		super();
		this.dependencies = new DependencyAggregation();
	}



@Override
public String toString() {
	
	return super.toString();//+"; deps: "+this.dependencies.toString();
}



/**
 * @uml.property  name="dependencies"
 * @uml.associationEnd  inverse="genericCompDefinition:org.nsanelab.dandy.xml.DependencyAggregation"
 * @uml.association  name="dependencies"
 */
private DependencyAggregation dependencies;



/**
 * Getter of the property <tt>dependencies</tt>
 * @return  Returns the dependencies.
 * @uml.property  name="dependencies"
 */
public DependencyAggregation getDependencies() {
	return dependencies;
}



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








}
