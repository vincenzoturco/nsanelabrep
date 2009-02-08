/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.utils;

import java.io.File;
import java.util.Collection;
import java.util.LinkedList;
import org.nsanelab.dandy.exceptions.NoDescriptorFoundException;

/**
 *
 * @author vin
 */
public class PathFinder {

    /**
     * Starting from the provided path, this method return a list of all the paths where a DC definition xml file can be found in the underlying file system subtree.
     * @param rootPath
     * @return
     */
    public static Collection<String> getDescriptors(String rootPath){
        File root, temp;
        File[] childrenList;
        Collection<String> descPathList;

        descPathList = new LinkedList<String>();

        root = new File(rootPath);

        if (!root.isDirectory()) {
            // do nothing
        } else {
            childrenList = root.listFiles();
            for (int i = 0; i < childrenList.length; i++) {
                if (childrenList[i].isDirectory()) {
                    descPathList.addAll(getDescriptors(childrenList[i].getAbsolutePath()));
                } else {
                    if (childrenList[i].getName().indexOf(".dcdef") != -1) {
                        descPathList.add(childrenList[i].getAbsolutePath());
                    }
                }

            }

        }
      
        return descPathList;
    }
}
