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
import org.nsanelab.dandy.domain.iface.IDependencyInfo;
import org.nsanelab.dandy.domain.iface.IGenericComp;

/**
 *
 * @author I044892
 */
public class UDCDependencyTest {

    public UDCDependencyTest() {
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
     * Test of getInfo method, of class UDCDependency.
     */
    @Test
    public void testGetInfo() {
        System.out.println("getInfo");
        UDCDependency instance = new UDCDependency();
        IDependencyInfo expResult = null;
        IDependencyInfo result = instance.getInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSrc method, of class UDCDependency.
     */
    @Test
    public void testGetSrc() {
        System.out.println("getSrc");
        UDCDependency instance = new UDCDependency();
        IGenericComp expResult = null;
        IGenericComp result = instance.getSrc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTgt method, of class UDCDependency.
     */
    @Test
    public void testGetTgt() {
        System.out.println("getTgt");
        UDCDependency instance = new UDCDependency();
        IGenericComp expResult = null;
        IGenericComp result = instance.getTgt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInfo method, of class UDCDependency.
     */
    @Test
    public void testSetInfo() {
        System.out.println("setInfo");
        IDependencyInfo info = null;
        UDCDependency instance = new UDCDependency();
        instance.setInfo(info);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSrc method, of class UDCDependency.
     */
    @Test
    public void testSetSrc() {
        System.out.println("setSrc");
        IGenericComp src = null;
        UDCDependency instance = new UDCDependency();
        instance.setSrc(src);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTgt method, of class UDCDependency.
     */
    @Test
    public void testSetTgt() {
        System.out.println("setTgt");
        IGenericComp tgt = null;
        UDCDependency instance = new UDCDependency();
        instance.setTgt(tgt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class UDCDependency.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object arg0 = null;
        UDCDependency instance = new UDCDependency();
        boolean expResult = false;
        boolean result = instance.equals(arg0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class UDCDependency.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        UDCDependency instance = new UDCDependency();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class UDCDependency.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        UDCDependency instance = new UDCDependency();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}