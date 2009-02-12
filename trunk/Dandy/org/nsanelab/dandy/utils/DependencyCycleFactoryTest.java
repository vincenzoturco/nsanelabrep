/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.nsanelab.dandy.domain.iface.IGenericComp;

/**
 *
 * @author I044892
 */
public class DependencyCycleFactoryTest {

    public DependencyCycleFactoryTest() {
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
     * Test of create method, of class DependencyCycleFactory.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        ComponentPath path = null;
        IGenericComp duplicateComp = null;
        DependencyCycleFactory instance = new DependencyCycleFactory();
        DependencyCycle expResult = null;
        DependencyCycle result = instance.create(path, duplicateComp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}