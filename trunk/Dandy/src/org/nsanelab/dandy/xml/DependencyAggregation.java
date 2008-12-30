package org.nsanelab.dandy.xml;

/**
 * @author  vin
 */
public class DependencyAggregation {
/**
 * @uml.property  name="dependency"
 * @uml.associationEnd  multiplicity="(0 -1)"
 */
private GenericDependency[] dependency;

public DependencyAggregation(){
	this.dependency = new GenericDependency[0];
}

/**
 * @return
 * @uml.property  name="dependency"
 */
public GenericDependency[] getDependency() {
	return dependency;
}

/**
 * @param dependency
 * @uml.property  name="dependency"
 */
public void setDependency(GenericDependency[] dependency) {
	this.dependency = dependency;
}

@Override
public String toString() {
	String retVal = "";
	
	for(int i=0;i<dependency.length;i++){
		retVal+="\n"+dependency[i].toString();
	}
	
	return retVal;

}





}
