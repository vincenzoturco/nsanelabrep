/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.prototypes;

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
public class GenericComponentTest {

    public GenericComponentTest() {
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
     * Test of getDependencies method, of class GenericComponent.
     */
    @Test
    public void testGetDependencies() {
        System.out.println("getDependencies");
        GenericComponent instance = new GenericComponent();
        DependencyAggregation expResult = null;
        DependencyAggregation result = instance.getDependencies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDependencies method, of class GenericComponent.
     */
    @Test
    public void testSetDependencies() {
        System.out.println("setDependencies");
        DependencyAggregation dependencies = null;
        GenericComponent instance = new GenericComponent();
        instance.setDependencies(dependencies);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class GenericComponent.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        GenericComponent instance = new GenericComponent();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}