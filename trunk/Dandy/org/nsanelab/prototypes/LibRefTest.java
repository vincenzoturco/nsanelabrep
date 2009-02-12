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
public class LibRefTest {

    public LibRefTest() {
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
     * Test of getLibraryName method, of class LibRef.
     */
    @Test
    public void testGetLibraryName() {
        System.out.println("getLibraryName");
        LibRef instance = new LibRef();
        String expResult = "";
        String result = instance.getLibraryName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLibraryName method, of class LibRef.
     */
    @Test
    public void testSetLibraryName() {
        System.out.println("setLibraryName");
        String libraryName = "";
        LibRef instance = new LibRef();
        instance.setLibraryName(libraryName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class LibRef.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        LibRef instance = new LibRef();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class LibRef.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        LibRef instance = new LibRef();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LibRef.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LibRef instance = new LibRef();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}