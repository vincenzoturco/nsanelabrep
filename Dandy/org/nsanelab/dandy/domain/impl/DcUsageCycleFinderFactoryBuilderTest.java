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
import org.nsanelab.dandy.domain.iface.ICycleFinderFactory;

/**
 *
 * @author I044892
 */
public class DcUsageCycleFinderFactoryBuilderTest {

    public DcUsageCycleFinderFactoryBuilderTest() {
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
     * Test of factoryInstance method, of class DcUsageCycleFinderFactoryBuilder.
     */
    @Test
    public void testFactoryInstance() {
        System.out.println("factoryInstance");
        DcUsageCycleFinderFactoryBuilder instance = new DcUsageCycleFinderFactoryBuilder();
        ICycleFinderFactory expResult = null;
        ICycleFinderFactory result = instance.factoryInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}