/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.xml.impl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author I044892
 */
public class CompMetadataTest {

    public CompMetadataTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getDcData method, of class CompMetadata.
     */
    @Test
    public void testGetDcData() {
        System.out.println("getDcData");
        CompMetadata instance = new CompMetadata();
        GenericCompDefinition expResult = null;
        GenericCompDefinition result = instance.getDcData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSharingDependencies method, of class CompMetadata.
     */
    @Test
    public void testGetSharingDependencies() {
        System.out.println("getSharingDependencies");
        CompMetadata instance = new CompMetadata();
        SharingDependency[] expResult = null;
        SharingDependency[] result = instance.getSharingDependencies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDcData method, of class CompMetadata.
     */
    @Test
    public void testSetDcData() {
        System.out.println("setDcData");
        GenericCompDefinition dcData = null;
        CompMetadata instance = new CompMetadata();
        instance.setDcData(dcData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSharingDependencies method, of class CompMetadata.
     */
    @Test
    public void testSetSharingDependencies() {
        System.out.println("setSharingDependencies");
        SharingDependency[] sharingDependency = null;
        CompMetadata instance = new CompMetadata();
        instance.setSharingDependencies(sharingDependency);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}