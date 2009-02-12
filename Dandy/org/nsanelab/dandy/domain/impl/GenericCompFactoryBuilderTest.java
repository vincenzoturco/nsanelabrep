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
import org.nsanelab.dandy.domain.iface.IGenericCompFactory;

/**
 *
 * @author I044892
 */
public class GenericCompFactoryBuilderTest {

    public GenericCompFactoryBuilderTest() {
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
     * Test of factoryInstance method, of class GenericCompFactoryBuilder.
     */
    @Test
    public void testFactoryInstance() {
        System.out.println("factoryInstance");
        GenericCompFactoryBuilder instance = new GenericCompFactoryBuilder();
        IGenericCompFactory expResult = null;
        IGenericCompFactory result = instance.factoryInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}