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
public class LibPropTest {

    public LibPropTest() {
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
     * Test of getProjectPropertiesLibraryReferences method, of class LibProp.
     */
    @Test
    public void testGetProjectPropertiesLibraryReferences() {
        System.out.println("getProjectPropertiesLibraryReferences");
        LibProp instance = new LibProp();
        LibRef[] expResult = null;
        LibRef[] result = instance.getProjectPropertiesLibraryReferences();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProjectPropertiesLibraryReferences method, of class LibProp.
     */
    @Test
    public void testSetProjectPropertiesLibraryReferences() {
        System.out.println("setProjectPropertiesLibraryReferences");
        LibRef[] projectPropertiesLibraryReferences = null;
        LibProp instance = new LibProp();
        instance.setProjectPropertiesLibraryReferences(projectPropertiesLibraryReferences);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LibProp.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LibProp instance = new LibProp();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}