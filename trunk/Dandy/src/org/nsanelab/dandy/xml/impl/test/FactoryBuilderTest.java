package org.nsanelab.dandy.xml.impl.test;

import org.nsanelab.dandy.xml.iface.ICompMetadataFactory;
import org.nsanelab.dandy.xml.iface.ICompMetadataFactoryBuilder;
import org.nsanelab.dandy.xml.impl.CompMetadataFactoryBuilder;

import junit.framework.TestCase;

public class FactoryBuilderTest extends TestCase {

	public void testFactoryInstance() {
		ICompMetadataFactoryBuilder builder = new CompMetadataFactoryBuilder();
		assertNotNull("Factory builder is null", builder);
		ICompMetadataFactory factory_1 = builder.factoryInstance();
		assertNotNull("Factory is null",factory_1);
		ICompMetadataFactory factory_2 = builder.factoryInstance();
		assertNotNull("Factory is null",factory_2);
		boolean identicalFactory = factory_1 == factory_2;
		assertEquals("Factory should not be reinstantiated",true, identicalFactory);
	}

}
