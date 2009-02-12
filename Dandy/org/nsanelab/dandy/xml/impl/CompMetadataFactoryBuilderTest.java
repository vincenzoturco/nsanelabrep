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
import org.nsanelab.dandy.xml.iface.ICompMetadataFactory;

/**
 *
 * @author I044892
 */
public class CompMetadataFactoryBuilderTest {

    public CompMetadataFactoryBuilderTest() {
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
     * Test of factoryInstance method, of class CompMetadataFactoryBuilder.
     */
    @Test
    public void testFactoryInstance() {
        System.out.println("factoryInstance");
        CompMetadataFactoryBuilder instance = new CompMetadataFactoryBuilder();
        ICompMetadataFactory expResult = null;
        ICompMetadataFactory result = instance.factoryInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}