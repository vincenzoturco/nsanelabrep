/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.usecase.iface;

import java.util.LinkedHashSet;
import org.nsanelab.dandy.domain.iface.IGraphVisitor;
import org.nsanelab.dandy.utils.DependencyCycle;

/**
 *
 * @author I044892
 */
public interface ICycleFinder extends IGraphVisitor {
/**
 * Lists the found graph cycles.
 * @return the cycle list
 */
    public LinkedHashSet<DependencyCycle> getFoundCycles();
}
