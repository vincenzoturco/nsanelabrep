/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.domain;

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
public class EDependencyTimeTest {

    public EDependencyTimeTest() {
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
     * Test of values method, of class EDependencyTime.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        EDependencyTime[] expResult = null;
        EDependencyTime[] result = EDependencyTime.values();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class EDependencyTime.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        EDependencyTime expResult = null;
        EDependencyTime result = EDependencyTime.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}