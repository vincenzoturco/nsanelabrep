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
import org.nsanelab.dandy.usecase.iface.ICycleFinder;

/**
 *
 * @author I044892
 */
public class CycleFinderFactoryTest {

    public CycleFinderFactoryTest() {
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
     * Test of getImplementation method, of class CycleFinderFactory.
     */
    @Test
    public void testGetImplementation() {
        System.out.println("getImplementation");
        CycleFinderFactory instance = new CycleFinderFactory();
        String expResult = "";
        String result = instance.getImplementation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImplementation method, of class CycleFinderFactory.
     */
    @Test
    public void testSetImplementation() {
        System.out.println("setImplementation");
        String implementation = "";
        CycleFinderFactory instance = new CycleFinderFactory();
        instance.setImplementation(implementation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class CycleFinderFactory.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        CycleFinderFactory instance = new CycleFinderFactory();
        ICycleFinder expResult = null;
        ICycleFinder result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}