/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.graph.impl;

import edu.uci.ics.jung.graph.DirectedGraph;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.nsanelab.dandy.domain.iface.IBaseDependency;
import org.nsanelab.dandy.domain.iface.IGenericComp;

/**
 *
 * @author I044892
 */
public class GraphFactoryImplTest {

    public GraphFactoryImplTest() {
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
     * Test of isIncludeStandard method, of class GraphFactoryImpl.
     */
    @Test
    public void testIsIncludeStandard() {
        System.out.println("isIncludeStandard");
        GraphFactoryImpl instance = new GraphFactoryImpl();
        boolean expResult = false;
        boolean result = instance.isIncludeStandard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIncludeStandard method, of class GraphFactoryImpl.
     */
    @Test
    public void testSetIncludeStandard() {
        System.out.println("setIncludeStandard");
        boolean includeStandard = false;
        GraphFactoryImpl instance = new GraphFactoryImpl();
        instance.setIncludeStandard(includeStandard);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class GraphFactoryImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Collection<IGenericComp> coll = null;
        GraphFactoryImpl instance = new GraphFactoryImpl();
        DirectedGraph<IGenericComp, IBaseDependency> expResult = null;
        DirectedGraph<IGenericComp, IBaseDependency> result = instance.create(coll);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}