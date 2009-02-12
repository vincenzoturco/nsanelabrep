/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.domain.impl;

import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.nsanelab.dandy.domain.iface.IBaseDependency;
import org.nsanelab.dandy.domain.iface.IGraphVisitor;

/**
 *
 * @author I044892
 */
public class GenericCompTest {

    public GenericCompTest() {
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
     * Test of isStandard method, of class GenericComp.
     */
    @Test
    public void testIsStandard() {
        System.out.println("isStandard");
        GenericComp instance = new GenericComp();
        boolean expResult = false;
        boolean result = instance.isStandard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInDep method, of class GenericComp.
     */
    @Test
    public void testGetInDep() {
        System.out.println("getInDep");
        GenericComp instance = new GenericComp();
        Collection<IBaseDependency> expResult = null;
        Collection<IBaseDependency> result = instance.getInDep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOutDep method, of class GenericComp.
     */
    @Test
    public void testGetOutDep() {
        System.out.println("getOutDep");
        GenericComp instance = new GenericComp();
        Collection<IBaseDependency> expResult = null;
        Collection<IBaseDependency> result = instance.getOutDep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInDep method, of class GenericComp.
     */
    @Test
    public void testSetInDep() {
        System.out.println("setInDep");
        Collection<IBaseDependency> inDep = null;
        GenericComp instance = new GenericComp();
        instance.setInDep(inDep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOutDep method, of class GenericComp.
     */
    @Test
    public void testSetOutDep() {
        System.out.println("setOutDep");
        Collection<IBaseDependency> outDep = null;
        GenericComp instance = new GenericComp();
        instance.setOutDep(outDep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class GenericComp.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        GenericComp instance = new GenericComp();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVendor method, of class GenericComp.
     */
    @Test
    public void testGetVendor() {
        System.out.println("getVendor");
        GenericComp instance = new GenericComp();
        String expResult = "";
        String result = instance.getVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class GenericComp.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        GenericComp instance = new GenericComp();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVendor method, of class GenericComp.
     */
    @Test
    public void testSetVendor() {
        System.out.println("setVendor");
        String vendor = "";
        GenericComp instance = new GenericComp();
        instance.setVendor(vendor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class GenericComp.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        GenericComp instance = new GenericComp();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class GenericComp.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        GenericComp instance = new GenericComp();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class GenericComp.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        GenericComp instance = new GenericComp();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of accept method, of class GenericComp.
     */
    @Test
    public void testAccept() throws Exception {
        System.out.println("accept");
        IGraphVisitor visitor = null;
        GenericComp instance = new GenericComp();
        instance.accept(visitor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}