package org.nsanelab.test;


public class LibProp {
	LibRef[] projectPropertiesLibraryReferences;
	
	public LibProp(){
		this.projectPropertiesLibraryReferences =  new LibRef[0];
	}
	
	public LibRef[] getProjectPropertiesLibraryReferences() {
		return projectPropertiesLibraryReferences;
	}

	public void setProjectPropertiesLibraryReferences(
			LibRef[] projectPropertiesLibraryReferences) {
		this.projectPropertiesLibraryReferences = projectPropertiesLibraryReferences;
	}
	
	public String toString(){
		String retVal = "";
		for(int i=0;i<projectPropertiesLibraryReferences.length;i++){
			retVal+=projectPropertiesLibraryReferences[i].toString()+"; ";
		}
		return retVal;
	}
	
}