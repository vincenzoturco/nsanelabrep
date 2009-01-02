package org.nsanelab.dandy.xml.impl.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.nsanelab.dandy.xml.iface.ICompMetadata;
import org.nsanelab.dandy.xml.iface.ICompMetadataFactory;
import org.nsanelab.dandy.xml.impl.CompMetadataFactoryBuilder;

import junit.framework.TestCase;

public class CompMetadataFactoryTest extends TestCase {

	String path;
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		this.path = "/media/SK160GB/lavori/DCs/it.sap/fsh/frmz/ui/dida/_comp/.dcdef";
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		this.path = null;
	}

	public void testCreate() {
		try {
			ICompMetadataFactory factory = new CompMetadataFactoryBuilder().factoryInstance();
			ICompMetadata comp = factory.create(path);
			System.out.println(comp.getSharingDependencies()[0].getIBaseCompDefinition().getName());
			assertNotNull(comp.getDcData());
			assertNotNull(comp.getSharingDependencies());
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
