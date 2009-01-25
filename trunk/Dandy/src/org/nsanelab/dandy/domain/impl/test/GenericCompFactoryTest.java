package org.nsanelab.dandy.domain.impl.test;

import junit.framework.TestCase;

import org.nsanelab.dandy.domain.iface.IBaseDependency;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.domain.iface.IGenericCompFactory;
import org.nsanelab.dandy.domain.iface.IGenericCompFactoryBuilder;
import org.nsanelab.dandy.domain.impl.GenericCompFactoryBuilder;
import org.nsanelab.dandy.xml.iface.ICompMetadata;
import org.nsanelab.dandy.xml.iface.ICompMetadataFactory;
import org.nsanelab.dandy.xml.iface.ICompMetadataFactoryBuilder;
import org.nsanelab.dandy.xml.impl.CompMetadataFactoryBuilder;

public class GenericCompFactoryTest extends TestCase {
private IGenericCompFactory factory;
private ICompMetadata metadata;
	protected void setUp() throws Exception {
		super.setUp();
		IGenericCompFactoryBuilder facBuild = new GenericCompFactoryBuilder();
		factory = facBuild.factoryInstance();
		//metadata init
		ICompMetadataFactoryBuilder metaBuild = new CompMetadataFactoryBuilder();
		ICompMetadataFactory metaFact = metaBuild.factoryInstance();
		metadata = metaFact.create("/media/SK160GB/lavori/DCs/it.sap/fsh/frmz/ui/tabcore/_comp/.dcdef");
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		factory = null;
		metadata = null;
	}

	public void testCreate() {
		IGenericComp comp = factory.create(metadata);
		IBaseDependency[] depArr = comp.getOutDep().toArray(new IBaseDependency[0]);
		assertEquals(8,depArr.length);
	}

}
