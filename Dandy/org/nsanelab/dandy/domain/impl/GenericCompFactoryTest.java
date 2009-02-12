/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.domain.impl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.xml.iface.ICompMetadata;

/**
 *
 * @author I044892
 */
public class GenericCompFactoryTest {

    public GenericCompFactoryTest() {
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
     * Test of create method, of class GenericCompFactory.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        ICompMetadata compMetadata = null;
        GenericCompFactory instance = new GenericCompFactory();
        IGenericComp expResult = null;
        IGenericComp result = instance.create(compMetadata);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}