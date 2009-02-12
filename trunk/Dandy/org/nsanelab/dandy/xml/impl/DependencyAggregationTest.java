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
public class DependencyAggregationTest {

    public DependencyAggregationTest() {
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
     * Test of toString method, of class DependencyAggregation.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DependencyAggregation instance = new DependencyAggregation();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDependency method, of class DependencyAggregation.
     */
    @Test
    public void testGetDependency() {
        System.out.println("getDependency");
        DependencyAggregation instance = new DependencyAggregation();
        GenericDependency[] expResult = null;
        GenericDependency[] result = instance.getDependency();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDependency method, of class DependencyAggregation.
     */
    @Test
    public void testSetDependency() {
        System.out.println("setDependency");
        GenericDependency[] dependency = null;
        DependencyAggregation instance = new DependencyAggregation();
        instance.setDependency(dependency);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}