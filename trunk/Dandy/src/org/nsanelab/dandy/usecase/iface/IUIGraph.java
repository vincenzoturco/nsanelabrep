package org.nsanelab.dandy.usecase.iface;

import javax.swing.JComponent;

public interface IUIGraph {

	public abstract void doGraph();

	/**
	 * Refreshes the graph associated with this object if existing.
	 * @return TODO
	 */
	public abstract JComponent refreshGraph();

}