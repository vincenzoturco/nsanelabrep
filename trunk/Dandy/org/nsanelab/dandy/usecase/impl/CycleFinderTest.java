/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.usecase.impl;

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
import org.nsanelab.dandy.domain.impl.GenericCompFactoryBuilder;
import org.nsanelab.dandy.graph.iface.IGraphFactory;
import org.nsanelab.dandy.graph.impl.GraphFactoryBuilder;
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
        ICompMetadata compMeta_2 = null;
        ICompMetadata compMeta_3 = null;
        try {
            compMeta = metaFact.create("C:\\Documents and Settings\\I044892\\Desktop\\download\\test folders\\test\\artificiali\\one\\.dcdef");
            compMeta_2 = metaFact.create("C:\\Documents and Settings\\I044892\\Desktop\\download\\test folders\\test\\artificiali\\two\\.dcdef");
            compMeta_3 = metaFact.create("C:\\Documents and Settings\\I044892\\Desktop\\download\\test folders\\test\\artificiali\\three\\.dcdef");
        } catch (Exception ex) {
            assertTrue(ex.getMessage(), false);
        }
        assertNotNull(compMeta);
        assertNotNull(compMeta_2);

        this.otherComp = compFact.create(compMeta_2);
        this.rootComp = compFact.create(compMeta);
        this.moreComp = compFact.create(compMeta_3);


        compColl.add(otherComp);
        compColl.add(this.rootComp);
        compColl.add(this.moreComp);

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
        CycleFinder instance = new CycleFinder();
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
        CycleFinder instance = new CycleFinder();
        instance.setFoundCycles(foundCycles);

    }

    /**
     * Test of getVisitedComponents method, of class CycleFinder.
     */
    @Test
    public void testGetVisitedComponents() {
        System.out.println("getVisitedComponents");
        CycleFinder instance = new CycleFinder();
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
        CycleFinder instance = new CycleFinder();
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
        CycleFinder instance = new CycleFinder();
        instance.setGraph(this.graph);
        System.out.println("vertici: "+this.graph.getVertices());
        assertNotNull(instance.getGraph());
        assertNotNull(instance.getGraph().getOutEdges(rootComp).iterator());
        assertNotNull(instance.getGraph().getOutEdges(otherComp).iterator());
        assertSame(instance.getGraph(), this.graph);
        assertArrayEquals(instance.getGraph().getOutEdges(rootComp).toArray(new IBaseDependency[0]), this.graph.getOutEdges(rootComp).toArray(new IBaseDependency[0]));
        instance.visit(this.rootComp);
       // assertEquals(new LinkedHashSet<DependencyCycle>(), instance.getFoundCycles() );
        assertEquals(1, instance.getFoundCycles().size());

    }

    /*public static void main(String[] args){
        CycleFinderTest test = new CycleFinderTest();
        test.setUp();
        test.testVisit();
    }*/
}