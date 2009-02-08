/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.domain.iface;

/**
 *
 * @author I044892
 */
public interface IVisitableNode {

public void accept(IGraphVisitor visitor);

}
