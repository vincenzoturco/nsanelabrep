/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.utils;

import java.io.File;
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
public class ExtensionFileFilterTest {

    public ExtensionFileFilterTest() {
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
     * Test of getDescription method, of class ExtensionFileFilter.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        ExtensionFileFilter instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of accept method, of class ExtensionFileFilter.
     */
    @Test
    public void testAccept() {
        System.out.println("accept");
        File file = null;
        ExtensionFileFilter instance = null;
        boolean expResult = false;
        boolean result = instance.accept(file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}