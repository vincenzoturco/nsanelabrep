/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.exceptions;

/**
 *
 * @author I044892
 */
public class CycleDetectionException extends GraphTraversalException{

    public CycleDetectionException(String arg0) {
        super(arg0);
    }

    public CycleDetectionException() {
        super();
    }

}
