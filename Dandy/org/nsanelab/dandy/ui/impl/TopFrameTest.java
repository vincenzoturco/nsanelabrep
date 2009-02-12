/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.ui.impl;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.util.Set;
import javax.swing.JTabbedPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.nsanelab.dandy.usecase.iface.IUIDependencyGraph;

/**
 *
 * @author I044892
 */
public class TopFrameTest {

    public TopFrameTest() {
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
     * Test of getTabs method, of class TopFrame.
     */
    @Test
    public void testGetTabs() {
        System.out.println("getTabs");
        TopFrame instance = new TopFrame();
        JTabbedPane expResult = null;
        JTabbedPane result = instance.getTabs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperationRunning method, of class TopFrame.
     */
    @Test
    public void testSetOperationRunning() {
        System.out.println("setOperationRunning");
        String opToDisplay = "";
        TopFrame instance = new TopFrame();
        instance.setOperationRunning(opToDisplay);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperationStopped method, of class TopFrame.
     */
    @Test
    public void testSetOperationStopped() {
        System.out.println("setOperationStopped");
        String opToDisplay = "";
        TopFrame instance = new TopFrame();
        instance.setOperationStopped(opToDisplay);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperationCompletionLevel method, of class TopFrame.
     */
    @Test
    public void testSetOperationCompletionLevel() {
        System.out.println("setOperationCompletionLevel");
        int currSize = 0;
        int maxSize = 0;
        TopFrame instance = new TopFrame();
        instance.setOperationCompletionLevel(currSize, maxSize);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatusMgr method, of class TopFrame.
     */
    @Test
    public void testGetStatusMgr() {
        System.out.println("getStatusMgr");
        TopFrame instance = new TopFrame();
        StatusMngr expResult = null;
        StatusMngr result = instance.getStatusMgr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatusMgr method, of class TopFrame.
     */
    @Test
    public void testSetStatusMgr() {
        System.out.println("setStatusMgr");
        StatusMngr statusMgr = null;
        TopFrame instance = new TopFrame();
        instance.setStatusMgr(statusMgr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of refreshGraphAt method, of class TopFrame.
     */
    @Test
    public void testRefreshGraphAt() {
        System.out.println("refreshGraphAt");
        int idx = 0;
        TopFrame instance = new TopFrame();
        instance.refreshGraphAt(idx);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showCriticalMessage method, of class TopFrame.
     */
    @Test
    public void testShowCriticalMessage() {
        System.out.println("showCriticalMessage");
        String message = "";
        TopFrame instance = new TopFrame();
        instance.showCriticalMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAllIcons method, of class TopFrame.
     */
    @Test
    public void testSetAllIcons() {
        System.out.println("setAllIcons");
        TopFrame instance = new TopFrame();
        instance.setAllIcons();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class TopFrame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TopFrame.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGraphs method, of class TopFrame.
     */
    @Test
    public void testGetGraphs() {
        System.out.println("getGraphs");
        TopFrame instance = new TopFrame();
        Set<IUIDependencyGraph> expResult = null;
        Set<IUIDependencyGraph> result = instance.getGraphs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGraphs method, of class TopFrame.
     */
    @Test
    public void testSetGraphs() {
        System.out.println("setGraphs");
        Set<IUIDependencyGraph> graphs = null;
        TopFrame instance = new TopFrame();
        instance.setGraphs(graphs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class TopFrame.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent arg0 = null;
        TopFrame instance = new TopFrame();
        instance.actionPerformed(arg0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of propertyChange method, of class TopFrame.
     */
    @Test
    public void testPropertyChange() {
        System.out.println("propertyChange");
        PropertyChangeEvent arg0 = null;
        TopFrame instance = new TopFrame();
        instance.propertyChange(arg0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}