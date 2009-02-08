/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.usecase.impl;

import java.util.LinkedHashSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.domain.iface.IGenericCompFactory;
import org.nsanelab.dandy.domain.impl.GenericCompFactoryBuilder;
import org.nsanelab.dandy.utils.ComponentPath;
import org.nsanelab.dandy.utils.DependencyCycle;

/**
 *
 * @author I044892
 */
public class CycleFinderTest {
    private static IGenericComp rootComp;
    
    public CycleFinderTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        IGenericCompFactory fact = new GenericCompFactoryBuilder().factoryInstance();

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getFoundCycles method, of class CycleFinder.
     */
    @Test
    public void testGetFoundCycles() {
        System.out.println("getFoundCycles");
        CycleFinder instance = new CycleFinder();
        LinkedHashSet<DependencyCycle> expResult = null;
        LinkedHashSet<DependencyCycle> result = instance.getFoundCycles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFoundCycles method, of class CycleFinder.
     */
    @Test
    public void testSetFoundCycles() {
        System.out.println("setFoundCycles");
        LinkedHashSet<DependencyCycle> foundCycles = null;
        CycleFinder instance = new CycleFinder();
        instance.setFoundCycles(foundCycles);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVisitedComponents method, of class CycleFinder.
     */
    @Test
    public void testGetVisitedComponents() {
        System.out.println("getVisitedComponents");
        CycleFinder instance = new CycleFinder();
        ComponentPath expResult = null;
        ComponentPath result = instance.getVisitedComponents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVisitedComponents method, of class CycleFinder.
     */
    @Test
    public void testSetVisitedComponents() {
        System.out.println("setVisitedComponents");
        ComponentPath visitedComponents = null;
        CycleFinder instance = new CycleFinder();
        instance.setVisitedComponents(visitedComponents);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visit method, of class CycleFinder.
     */
    @Test
    public void testVisit() {
        System.out.println("visit");
        IGenericComp node = null;
        CycleFinder instance = new CycleFinder();
        instance.visit(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}