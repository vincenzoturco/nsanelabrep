/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.domain.iface;

import org.nsanelab.dandy.exceptions.DependencyCycleException;
import org.nsanelab.dandy.utils.DependencyCycle;

/**
 *
 * @author I044892
 */
public interface IGraphVisitor {

    public void visit(IGenericComp node);

}
