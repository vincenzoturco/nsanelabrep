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
import org.nsanelab.dandy.xml.iface.ICompMetadata;

/**
 *
 * @author I044892
 */
public class CompMetadataFactoryTest {

    public CompMetadataFactoryTest() {
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
     * Test of create method, of class CompMetadataFactory.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        String pathToDescriptor = "";
        CompMetadataFactory instance = new CompMetadataFactory();
        ICompMetadata expResult = null;
        ICompMetadata result = instance.create(pathToDescriptor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}