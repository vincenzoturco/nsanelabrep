/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.usecase.impl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.nsanelab.dandy.domain.iface.IBaseDependency;
import org.nsanelab.dandy.domain.impl.CycleFinder;

/**
 *
 * @author I044892
 */
public class DCDepCycleFinderTest {

    public DCDepCycleFinderTest() {
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
     * Test of validateEdge method, of class DCDepCycleFinder.
     */
    @Test
    public void testValidateEdge() {
        System.out.println("validateEdge");
        IBaseDependency tmpEdge = null;
        DCDepCycleFinder instance = new DCDepCycleFinder();
        boolean expResult = false;
        boolean result = instance.validateEdge(tmpEdge);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNewInstance method, of class DCDepCycleFinder.
     */
    @Test
    public void testCreateNewInstance() {
        System.out.println("createNewInstance");
        DCDepCycleFinder instance = new DCDepCycleFinder();
        CycleFinder expResult = null;
        CycleFinder result = instance.createNewInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}