package org.nsanelab.dandy.usecase.iface;

import javax.swing.JComponent;

public interface IUIDependencyGraph {

	public abstract void doGraph();

	/**
	 * Refreshes the graph associated with this object if existing.
	 * @return TODO
	 */
	public abstract JComponent refreshGraph();
    public abstract void setIncludeStandard(boolean val);
    public abstract boolean isIncludeStandard();
    public boolean checkRuntimeCycles();
    public boolean checkComponentDefinitionCycles();
    
    
}