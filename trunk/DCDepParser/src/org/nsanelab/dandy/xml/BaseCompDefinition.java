package org.nsanelab.dandy.xml;


/**
 * @author  vin
 */
public class BaseCompDefinition {
private String name;
private String vendor;

/**
 * @return
 * @uml.property  name="name"
 */
public String getName() {
	return name;
}
/**
 * @param name
 * @uml.property  name="name"
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return
 * @uml.property  name="vendor"
 */
public String getVendor() {
	return vendor;
}
/**
 * @param vendor
 * @uml.property  name="vendor"
 */
public void setVendor(String vendor) {
	this.vendor = vendor;
}
@Override
public String toString() {
	String retVal;
	retVal = this.vendor+"/"+this.name;
	retVal = "..."+retVal.substring(retVal.lastIndexOf('/'));
	
	return retVal;
}
@Override
public boolean equals(Object obj) {
	return (this.getClass().isInstance(obj)) && (((BaseCompDefinition)obj).getName().equals(this.getName())) &&
	(((BaseCompDefinition)obj).getVendor().equals(this.getVendor()));
}
@Override
public int hashCode() {
	return this.name.hashCode()+(30*this.vendor.hashCode());
}

public boolean isStandard(){
	return this.vendor.equals("sap.com");
}



}
