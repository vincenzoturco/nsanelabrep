package org.nsanelab.dandy.xml;

/**
 * @author  vin
 */
public class DependencyType {
private String type;
private static final String DEP_RUNTIME = "runtime";
private static final String DEP_BUILDTIME = "buildtime";
/**
 * @uml.property  name="tYPE_BUILDTIME"
 * @uml.associationEnd  
 */
public static final DependencyType TYPE_BUILDTIME = new DependencyType(DEP_BUILDTIME);
/**
 * @uml.property  name="tYPE_RUNTIME"
 * @uml.associationEnd  
 */
public static final DependencyType TYPE_RUNTIME = new DependencyType(DEP_RUNTIME);
private DependencyType(String type){
	this.type = type;
}

public DependencyType(){
	
}

/**
 * @return
 * @uml.property  name="type"
 */
public String getType() {
	return type;
}
/**
 * @param type
 * @uml.property  name="type"
 */
public void setType(String type) {
	this.type = type;
}

}
