package org.nsanelab.dandy.xml.iface;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;




public interface ICompMetadataFactory {

		
		/**
		 */
		public ICompMetadata create(String pathToDescriptor) throws FileNotFoundException, IOException;
		
		

}
