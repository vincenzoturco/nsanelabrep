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
import org.nsanelab.dandy.domain.EDependencyTime;

/**
 *
 * @author I044892
 */
public class GenericDependencyTest {

    public GenericDependencyTest() {
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
     * Test of getDc_ref method, of class GenericDependency.
     */
    @Test
    public void testGetDc_ref() {
        System.out.println("getDc_ref");
        GenericDependency instance = new GenericDependency();
        BaseCompDefinition expResult = null;
        BaseCompDefinition result = instance.getDc_ref();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDc_ref method, of class GenericDependency.
     */
    @Test
    public void testSetDc_ref() {
        System.out.println("setDc_ref");
        BaseCompDefinition dc_ref = null;
        GenericDependency instance = new GenericDependency();
        instance.setDc_ref(dc_ref);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class GenericDependency.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        GenericDependency instance = new GenericDependency();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPp_ref method, of class GenericDependency.
     */
    @Test
    public void testGetPp_ref() {
        System.out.println("getPp_ref");
        GenericDependency instance = new GenericDependency();
        String expResult = "";
        String result = instance.getPp_ref();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPp_ref method, of class GenericDependency.
     */
    @Test
    public void testSetPp_ref() {
        System.out.println("setPp_ref");
        String pp_ref = "";
        GenericDependency instance = new GenericDependency();
        instance.setPp_ref(pp_ref);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDependencyType method, of class GenericDependency.
     */
    @Test
    public void testGetDependencyType() {
        System.out.println("getDependencyType");
        GenericDependency instance = new GenericDependency();
        EDependencyTime expResult = null;
        EDependencyTime result = instance.getDependencyType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDependencyType method, of class GenericDependency.
     */
    @Test
    public void testSetDependencyType() {
        System.out.println("setDependencyType");
        EDependencyTime dependencyType = null;
        GenericDependency instance = new GenericDependency();
        instance.setDependencyType(dependencyType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}