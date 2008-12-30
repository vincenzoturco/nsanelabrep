package org.nsanelab.dandy.xml.impl;

import org.nsanelab.dandy.xml.iface.IBaseCompDefinition;


/**
 * @author  vin
 */
public class BaseCompDefinition implements IBaseCompDefinition {
private String name;
private String vendor;

/* (non-Javadoc)
 * @see org.nsanelab.dandy.xml.IBaseCompDefinition#getName()
 */
public String getName() {
	return name;
}
/* (non-Javadoc)
 * @see org.nsanelab.dandy.xml.IBaseCompDefinition#setName(java.lang.String)
 */
public void setName(String name) {
	this.name = name;
}
/* (non-Javadoc)
 * @see org.nsanelab.dandy.xml.IBaseCompDefinition#getVendor()
 */
public String getVendor() {
	return vendor;
}
/* (non-Javadoc)
 * @see org.nsanelab.dandy.xml.IBaseCompDefinition#setVendor(java.lang.String)
 */
public void setVendor(String vendor) {
	this.vendor = vendor;
}
/* (non-Javadoc)
 * @see org.nsanelab.dandy.xml.IBaseCompDefinition#toString()
 */
@Override
public String toString() {
	String retVal;
	retVal = this.vendor+"/"+this.name;
	retVal = "..."+retVal.substring(retVal.lastIndexOf('/'));
	
	return retVal;
}
/* (non-Javadoc)
 * @see org.nsanelab.dandy.xml.IBaseCompDefinition#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj) {
	return (this.getClass().isInstance(obj)) && (((IBaseCompDefinition)obj).getName().equals(this.getName())) &&
	(((IBaseCompDefinition)obj).getVendor().equals(this.getVendor()));
}
/* (non-Javadoc)
 * @see org.nsanelab.dandy.xml.IBaseCompDefinition#hashCode()
 */
@Override
public int hashCode() {
	return this.name.hashCode()+(30*this.vendor.hashCode());
}

/* (non-Javadoc)
 * @see org.nsanelab.dandy.xml.IBaseCompDefinition#isStandard()
 */
public boolean isStandard(){
	return this.vendor.equals("sap.com");
}



}
