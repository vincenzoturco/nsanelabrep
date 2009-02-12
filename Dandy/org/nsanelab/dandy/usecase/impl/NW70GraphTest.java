/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.usecase.impl;

import edu.uci.ics.jung.graph.DirectedGraph;
import java.util.LinkedList;
import javax.swing.JComponent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.nsanelab.dandy.domain.iface.IBaseDependency;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.ui.impl.TopFrame;

/**
 *
 * @author I044892
 */
public class NW70GraphTest {

    public NW70GraphTest() {
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
     * Test of doGraph method, of class NW70Graph.
     */
    @Test
    public void testDoGraph() {
        System.out.println("doGraph");
        NW70Graph instance = null;
        instance.doGraph();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMainFrame method, of class NW70Graph.
     */
    @Test
    public void testGetMainFrame() {
        System.out.println("getMainFrame");
        NW70Graph instance = null;
        TopFrame expResult = null;
        TopFrame result = instance.getMainFrame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMainFrame method, of class NW70Graph.
     */
    @Test
    public void testSetMainFrame() {
        System.out.println("setMainFrame");
        TopFrame mainFrame = null;
        NW70Graph instance = null;
        instance.setMainFrame(mainFrame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDomCompColl method, of class NW70Graph.
     */
    @Test
    public void testGetDomCompColl() {
        System.out.println("getDomCompColl");
        NW70Graph instance = null;
        LinkedList<IGenericComp> expResult = null;
        LinkedList<IGenericComp> result = instance.getDomCompColl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDomCompColl method, of class NW70Graph.
     */
    @Test
    public void testSetDomCompColl() {
        System.out.println("setDomCompColl");
        LinkedList<IGenericComp> domCompColl = null;
        NW70Graph instance = null;
        instance.setDomCompColl(domCompColl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGraph method, of class NW70Graph.
     */
    @Test
    public void testGetGraph() {
        System.out.println("getGraph");
        NW70Graph instance = null;
        DirectedGraph<IGenericComp, IBaseDependency> expResult = null;
        DirectedGraph<IGenericComp, IBaseDependency> result = instance.getGraph();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGraph method, of class NW70Graph.
     */
    @Test
    public void testSetGraph() {
        System.out.println("setGraph");
        DirectedGraph<IGenericComp, IBaseDependency> graph = null;
        NW70Graph instance = null;
        instance.setGraph(graph);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOutComp method, of class NW70Graph.
     */
    @Test
    public void testGetOutComp() {
        System.out.println("getOutComp");
        NW70Graph instance = null;
        JComponent expResult = null;
        JComponent result = instance.getOutComp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOutComp method, of class NW70Graph.
     */
    @Test
    public void testSetOutComp() {
        System.out.println("setOutComp");
        JComponent outComp = null;
        NW70Graph instance = null;
        instance.setOutComp(outComp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of refreshGraph method, of class NW70Graph.
     */
    @Test
    public void testRefreshGraph() {
        System.out.println("refreshGraph");
        NW70Graph instance = null;
        JComponent expResult = null;
        JComponent result = instance.refreshGraph();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doInBackground method, of class NW70Graph.
     */
    @Test
    public void testDoInBackground() throws Exception {
        System.out.println("doInBackground");
        NW70Graph instance = null;
        Void expResult = null;
        Void result = instance.doInBackground();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIncludeStandard method, of class NW70Graph.
     */
    @Test
    public void testSetIncludeStandard() {
        System.out.println("setIncludeStandard");
        boolean val = false;
        NW70Graph instance = null;
        instance.setIncludeStandard(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIncludeStandard method, of class NW70Graph.
     */
    @Test
    public void testIsIncludeStandard() {
        System.out.println("isIncludeStandard");
        NW70Graph instance = null;
        boolean expResult = false;
        boolean result = instance.isIncludeStandard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkSharedRefCycles method, of class NW70Graph.
     */
    @Test
    public void testCheckRuntimeCycles() {
        System.out.println("checkRuntimeCycles");
        NW70Graph instance = null;
        boolean expResult = false;
        boolean result = instance.checkSharedRefCycles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkComponentDefinitionCycles method, of class NW70Graph.
     */
    @Test
    public void testCheckComponentDefinitionCycles() {
        System.out.println("checkComponentDefinitionCycles");
        NW70Graph instance = null;
        boolean expResult = false;
        boolean result = instance.checkComponentDefinitionCycles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}