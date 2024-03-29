/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.utils;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
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
public class SetExtensionTest {

    public SetExtensionTest() {
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
     * Test of remove method, of class SetExtension.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testRemove() throws Exception {
        System.out.println("remove");
        int index = 3;
        SetExtension instance = new SetExtension();
        String one = "one";
        String two = "two";
        String three = "three";

        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add(one);
        set.add(two);
        set.add(three);
        instance.setASet(set);

        assertEquals(set, instance.getASet());

        Set expResult = new HashSet();
        expResult.add(one);
        expResult.add(two);

        Set result = instance.remove(index);
        assertEquals(expResult, result);

        expResult = new HashSet();
        expResult.add(two);
        expResult.add(one);

        assertTrue(result.equals(expResult));

    // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getASet method, of class SetExtension.
     */
    @Test
    public void testGetASet() {
        System.out.println("getASet");
        SetExtension instance = new SetExtension();
        Set expResult = null;
        Set result = instance.getASet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setASet method, of class SetExtension.
     */
    @Test
    public void testSetASet() {
        System.out.println("setASet");
        Set aSet = null;
        SetExtension instance = new SetExtension();
        instance.setASet(aSet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class SetExtension.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int index = 0;
        SetExtension instance = new SetExtension();
        Set expResult = null;
        Set result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}