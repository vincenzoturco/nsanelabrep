/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.ui.impl;

import java.beans.PropertyChangeListener;
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
public class StatusMngrTest {

    public StatusMngrTest() {
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
     * Test of addPropertyChangeListener method, of class StatusMngr.
     */
    @Test
    public void testAddPropertyChangeListener() {
        System.out.println("addPropertyChangeListener");
        PropertyChangeListener listener = null;
        StatusMngr instance = new StatusMngr();
        instance.addPropertyChangeListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removePropertyChangeListener method, of class StatusMngr.
     */
    @Test
    public void testRemovePropertyChangeListener() {
        System.out.println("removePropertyChangeListener");
        PropertyChangeListener listener = null;
        StatusMngr instance = new StatusMngr();
        instance.removePropertyChangeListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIndeterminate method, of class StatusMngr.
     */
    @Test
    public void testIsIndeterminate() {
        System.out.println("isIndeterminate");
        StatusMngr instance = new StatusMngr();
        boolean expResult = false;
        boolean result = instance.isIndeterminate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class StatusMngr.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        StatusMngr instance = new StatusMngr();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskCurrentStatus method, of class StatusMngr.
     */
    @Test
    public void testGetTaskCurrentStatus() {
        System.out.println("getTaskCurrentStatus");
        StatusMngr instance = new StatusMngr();
        int expResult = 0;
        int result = instance.getTaskCurrentStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskSize method, of class StatusMngr.
     */
    @Test
    public void testGetTaskSize() {
        System.out.println("getTaskSize");
        StatusMngr instance = new StatusMngr();
        int expResult = 0;
        int result = instance.getTaskSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIndeterminate method, of class StatusMngr.
     */
    @Test
    public void testSetIndeterminate() {
        System.out.println("setIndeterminate");
        boolean isIndeterminate = false;
        StatusMngr instance = new StatusMngr();
        instance.setIndeterminate(isIndeterminate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class StatusMngr.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        StatusMngr instance = new StatusMngr();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskCurrentStatus method, of class StatusMngr.
     */
    @Test
    public void testSetTaskCurrentStatus() {
        System.out.println("setTaskCurrentStatus");
        int taskCurrentStatus = 0;
        StatusMngr instance = new StatusMngr();
        instance.setTaskCurrentStatus(taskCurrentStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskSize method, of class StatusMngr.
     */
    @Test
    public void testSetTaskSize() {
        System.out.println("setTaskSize");
        int taskSize = 0;
        StatusMngr instance = new StatusMngr();
        instance.setTaskSize(taskSize);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}