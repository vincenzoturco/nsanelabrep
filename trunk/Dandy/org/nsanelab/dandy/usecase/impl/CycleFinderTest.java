/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.usecase.impl;

import org.nsanelab.dandy.domain.impl.CycleFinder;
import edu.uci.ics.jung.graph.DirectedGraph;
import java.util.Collection;
import java.util.LinkedHashSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.nsanelab.dandy.domain.iface.IBaseDependency;
import static org.junit.Assert.*;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.domain.iface.IGenericCompFactory;
import org.nsanelab.dandy.domain.impl.DcUsageCycleFinderFactoryBuilder;
import org.nsanelab.dandy.domain.impl.GenericCompFactoryBuilder;
import org.nsanelab.dandy.graph.iface.IGraphFactory;
import org.nsanelab.dandy.graph.impl.GraphFactoryBuilder;
import org.nsanelab.dandy.usecase.iface.ICycleFinder;
import org.nsanelab.dandy.utils.ComponentPath;
import org.nsanelab.dandy.utils.DependencyCycle;
import org.nsanelab.dandy.xml.iface.ICompMetadata;
import org.nsanelab.dandy.xml.iface.ICompMetadataFactory;
import org.nsanelab.dandy.xml.impl.CompMetadataFactoryBuilder;

/**
 *
 * @author I044892
 */
public class CycleFinderTest {

    private IGenericComp rootComp;
    private IGenericComp otherComp;
    private IGenericComp moreComp;
    private IGenericComp comp_4;
    private IGenericComp comp_5;
    private IGenericComp comp_6;
    private IGenericComp comp_7;
    private IGenericComp comp_8;
    private IGenericComp comp_9;
    private DirectedGraph<IGenericComp, IBaseDependency> graph;

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
        IGenericCompFactory compFact = new GenericCompFactoryBuilder().factoryInstance();
        ICompMetadataFactory metaFact = new CompMetadataFactoryBuilder().factoryInstance();
        IGraphFactory graphFact = new GraphFactoryBuilder().factoryInstance();
        Collection<IGenericComp> compColl = new LinkedHashSet<IGenericComp>();

        ICompMetadata compMeta = null;
        ICompMetadata compMeta_3 = null;
        ICompMetadata compMeta_2 = null;
        ICompMetadata compMeta_4 = null;
        ICompMetadata compMeta_5 = null;
        ICompMetadata compMeta_6 = null;
        ICompMetadata compMeta_7 = null;
        ICompMetadata compMeta_8 = null;
        ICompMetadata compMeta_9 = null;

        try {
            compMeta = metaFact.create("C:\\Documents and Settings\\I044892\\Desktop\\download\\test folders\\test\\artificiali\\one\\.dcdef");
            compMeta_2 = metaFact.create("C:\\Documents and Settings\\I044892\\Desktop\\download\\test folders\\test\\artificiali\\two\\.dcdef");
            compMeta_3 = metaFact.create("C:\\Documents and Settings\\I044892\\Desktop\\download\\test folders\\test\\artificiali\\three\\.dcdef");
            compMeta_4 = metaFact.create("C:\\Documents and Settings\\I044892\\Desktop\\download\\test folders\\test\\artificiali\\four\\.dcdef");
            compMeta_5 = metaFact.create("C:\\Documents and Settings\\I044892\\Desktop\\download\\test folders\\test\\artificiali\\five\\.dcdef");
            compMeta_6 = metaFact.create("C:\\Documents and Settings\\I044892\\Desktop\\download\\test folders\\test\\artificiali\\six\\.dcdef");
            compMeta_7 = metaFact.create("C:\\Documents and Settings\\I044892\\Desktop\\download\\test folders\\test\\artificiali\\seven\\.dcdef");
            compMeta_8 = metaFact.create("C:\\Documents and Settings\\I044892\\Desktop\\download\\test folders\\test\\artificiali\\eight\\.dcdef");
            compMeta_9 = metaFact.create("C:\\Documents and Settings\\I044892\\Desktop\\download\\test folders\\test\\artificiali\\nine\\.dcdef");
        } catch (Exception ex) {
            assertTrue(ex.getMessage(), false);
        }
        assertNotNull(compMeta);
        assertNotNull(compMeta_2);

        this.otherComp = compFact.create(compMeta_2);
        this.rootComp = compFact.create(compMeta);
        this.moreComp = compFact.create(compMeta_3);
        this.comp_4 = compFact.create(compMeta_4);
        this.comp_5 = compFact.create(compMeta_5);
        this.comp_6 = compFact.create(compMeta_6);
        this.comp_7 = compFact.create(compMeta_7);
        this.comp_8 = compFact.create(compMeta_8);
        this.comp_9 = compFact.create(compMeta_9);


        compColl.add(otherComp);
        compColl.add(this.rootComp);
        compColl.add(this.moreComp);
        compColl.add(this.comp_4);
        compColl.add(this.comp_5);
        compColl.add(this.comp_6);
        compColl.add(this.comp_7);
        compColl.add(this.comp_8);
        compColl.add(this.comp_9);

        this.graph = graphFact.create(compColl);

        assertNotNull(rootComp);
        assertNotNull(otherComp);
        assertNotNull(this.graph);
    }

    @After
    public void tearDown() {
        this.rootComp = null;
    }

    /**
     * Test of getFoundCycles method, of class CycleFinder.
     */
    @Test
    public void testGetFoundCycles() {
        System.out.println("getFoundCycles");
        ICycleFinder instance = new DcUsageCycleFinderFactoryBuilder().factoryInstance().create();
        LinkedHashSet<DependencyCycle> expResult = new LinkedHashSet<DependencyCycle>();
        LinkedHashSet<DependencyCycle> result = instance.getFoundCycles();
        assertEquals(expResult, result);

    }

    /**
     * Test of setFoundCycles method, of class CycleFinder.
     */
    @Test
    public void testSetFoundCycles() {
        System.out.println("setFoundCycles");
        LinkedHashSet<DependencyCycle> foundCycles = new LinkedHashSet<DependencyCycle>();
        ICycleFinder instance = new DcUsageCycleFinderFactoryBuilder().factoryInstance().create();
        instance.setFoundCycles(foundCycles);

    }

    /**
     * Test of getVisitedComponents method, of class CycleFinder.
     */
    @Test
    public void testGetVisitedComponents() {
        System.out.println("getVisitedComponents");
        ICycleFinder instance = new DcUsageCycleFinderFactoryBuilder().factoryInstance().create();

        ComponentPath expResult = new ComponentPath();
        ComponentPath result = instance.getVisitedComponents();
        assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    // fail("The test case is a prototype.");
    }

    /**
     * Test of setVisitedComponents method, of class CycleFinder.
     */
    @Test
    public void testSetVisitedComponents() {
        System.out.println("setVisitedComponents");
        ComponentPath visitedComponents = new ComponentPath();
        ICycleFinder instance = new DcUsageCycleFinderFactoryBuilder().factoryInstance().create();

        instance.setVisitedComponents(visitedComponents);
    // TODO review the generated test code and remove the default call to fail.
    // fail("The test case is a prototype.");
    }

    /**
     * Test of visit method, of class CycleFinder.
     */
    @Test
    public void testVisit() {

        System.out.println("visit");
        ICycleFinder instance = new DcUsageCycleFinderFactoryBuilder().factoryInstance().create();

        instance.setGraph(this.graph);
        System.out.println("vertici: " + this.graph.getVertices());
         try {
            instance.visit(this.rootComp);
        } catch (Exception e) {
           fail(e.getMessage());
        }
        // assertEquals(new LinkedHashSet<DependencyCycle>(), instance.getFoundCycles() );
        System.out.println("cicli trovati: " + instance.getFoundCycles());
        assertEquals(1, instance.getFoundCycles().size());


    }

    /*public static void main(String[] args){
    CycleFinderTest test = new CycleFinderTest();
    test.setUp();
    test.testVisit();
    }*/
}