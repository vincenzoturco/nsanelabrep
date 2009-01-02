package org.nsanelab.dandy.domain.iface;

import org.nsanelab.dandy.xml.iface.ICompMetadata;


public interface IGenericCompFactory {

		
		/**
		 */
		public abstract IGenericComp create(ICompMetadata compMetadata);
		

}
