/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.utils;


import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author I044892
 */
public class SetExtension {

    public Set getASet() {
        return aSet;
    }

    public void setASet(Set aSet) {
        this.aSet = aSet;
    }

    private Set aSet;

    public SetExtension(){
        this.aSet = new LinkedHashSet();
    }

    public SetExtension(Collection coll){
        this.aSet = new LinkedHashSet(coll);
    
    }
/**
 * Removes the element at the specified index from this.aSet. Updates the aSet instance variable of this object.
 * @param index element to remove.
 * @return returns the aSet for this Object without the removed element
 */


    public Set remove(int index) throws IllegalArgumentException {
              
        if(index>=this.aSet.size()){
            throw new IllegalArgumentException("Index exceeds size of the specified set");
        }

        Object[] tmpArr = aSet.toArray();

        //shift all elements one step behind
        for (int idx = index; idx < tmpArr.length - 1; idx++) {
            tmpArr[idx] = tmpArr[idx + 1];
        }

        tmpArr = cern.colt.Arrays.trimToCapacity(tmpArr, tmpArr.length - 1);
        this.aSet = new LinkedHashSet(java.util.Arrays.asList(tmpArr));
        return aSet;
    }
}
