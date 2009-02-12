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
public class BaseCompDefinitionTest {

    public BaseCompDefinitionTest() {
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
     * Test of getName method, of class BaseCompDefinition.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        BaseCompDefinition instance = new BaseCompDefinition();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class BaseCompDefinition.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        BaseCompDefinition instance = new BaseCompDefinition();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVendor method, of class BaseCompDefinition.
     */
    @Test
    public void testGetVendor() {
        System.out.println("getVendor");
        BaseCompDefinition instance = new BaseCompDefinition();
        String expResult = "";
        String result = instance.getVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVendor method, of class BaseCompDefinition.
     */
    @Test
    public void testSetVendor() {
        System.out.println("setVendor");
        String vendor = "";
        BaseCompDefinition instance = new BaseCompDefinition();
        instance.setVendor(vendor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class BaseCompDefinition.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BaseCompDefinition instance = new BaseCompDefinition();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class BaseCompDefinition.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        BaseCompDefinition instance = new BaseCompDefinition();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class BaseCompDefinition.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        BaseCompDefinition instance = new BaseCompDefinition();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isStandard method, of class BaseCompDefinition.
     */
    @Test
    public void testIsStandard() {
        System.out.println("isStandard");
        BaseCompDefinition instance = new BaseCompDefinition();
        boolean expResult = false;
        boolean result = instance.isStandard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}