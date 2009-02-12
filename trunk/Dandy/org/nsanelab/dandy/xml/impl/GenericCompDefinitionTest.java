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
public class GenericCompDefinitionTest {

    public GenericCompDefinitionTest() {
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
     * Test of toString method, of class GenericCompDefinition.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        GenericCompDefinition instance = new GenericCompDefinition();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDependencies method, of class GenericCompDefinition.
     */
    @Test
    public void testGetDependencies() {
        System.out.println("getDependencies");
        GenericCompDefinition instance = new GenericCompDefinition();
        DependencyAggregation expResult = null;
        DependencyAggregation result = instance.getDependencies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDependencies method, of class GenericCompDefinition.
     */
    @Test
    public void testSetDependencies() {
        System.out.println("setDependencies");
        DependencyAggregation dependencies = null;
        GenericCompDefinition instance = new GenericCompDefinition();
        instance.setDependencies(dependencies);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}