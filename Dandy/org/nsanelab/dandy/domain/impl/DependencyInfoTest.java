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
import org.nsanelab.dandy.domain.EDependencyTime;

/**
 *
 * @author I044892
 */
public class DependencyInfoTest {

    public DependencyInfoTest() {
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
     * Test of getDepTime method, of class DependencyInfo.
     */
    @Test
    public void testGetDepTime() {
        System.out.println("getDepTime");
        DependencyInfo instance = new DependencyInfo();
        EDependencyTime expResult = null;
        EDependencyTime result = instance.getDepTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPublicPart method, of class DependencyInfo.
     */
    @Test
    public void testGetPublicPart() {
        System.out.println("getPublicPart");
        DependencyInfo instance = new DependencyInfo();
        String expResult = "";
        String result = instance.getPublicPart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDepTime method, of class DependencyInfo.
     */
    @Test
    public void testSetDepTime() {
        System.out.println("setDepTime");
        EDependencyTime depTime = null;
        DependencyInfo instance = new DependencyInfo();
        instance.setDepTime(depTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPublicPart method, of class DependencyInfo.
     */
    @Test
    public void testSetPublicPart() {
        System.out.println("setPublicPart");
        String publicPart = "";
        DependencyInfo instance = new DependencyInfo();
        instance.setPublicPart(publicPart);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class DependencyInfo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        DependencyInfo instance = new DependencyInfo();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class DependencyInfo.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        DependencyInfo instance = new DependencyInfo();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}