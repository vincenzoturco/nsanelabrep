package org.nsanelab.dandy.usecase.iface;

import java.util.Collection;
import javax.swing.JComponent;
import org.nsanelab.dandy.exceptions.GraphTraversalException;
import org.nsanelab.dandy.utils.DependencyCycle;

public interface IUIDependencyGraph {

	public abstract void doGraph();

	/**
	 * Refreshes the graph associated with this object if existing.
	 * @return TODO
	 */
	public abstract JComponent refreshGraph();
    public abstract void setIncludeStandard(boolean val);
    public abstract boolean isIncludeStandard();
    public boolean checkSharedRefCycles();
    public boolean checkComponentDefinitionCycles() throws GraphTraversalException;
    public Collection<DependencyCycle> getDependencyCycles() ;
    
}