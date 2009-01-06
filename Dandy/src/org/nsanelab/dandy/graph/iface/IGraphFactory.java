/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.graph.iface;

import java.util.Collection;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import edu.uci.ics.jung.graph.DirectedGraph;
import org.nsanelab.dandy.domain.iface.IBaseDependency;

/**
 *
 * @author vin
 */
public interface IGraphFactory {

   public DirectedGraph<IGenericComp, IBaseDependency> create(Collection<IGenericComp> coll)  ;
}
