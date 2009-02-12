/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.graph.impl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.nsanelab.dandy.graph.iface.IGraphFactory;

/**
 *
 * @author I044892
 */
public class GraphFactoryWithStandardBuilderTest {

    public GraphFactoryWithStandardBuilderTest() {
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
     * Test of factoryInstance method, of class GraphFactoryWithStandardBuilder.
     */
    @Test
    public void testFactoryInstance() {
        System.out.println("factoryInstance");
        GraphFactoryWithStandardBuilder instance = new GraphFactoryWithStandardBuilder();
        IGraphFactory expResult = null;
        IGraphFactory result = instance.factoryInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}