/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.prototypes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author I044892
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({org.nsanelab.prototypes.DependencyAggregationTest.class,org.nsanelab.prototypes.BaseComponentTest.class,org.nsanelab.prototypes.TestWDPropsTest.class,org.nsanelab.prototypes.GenericDependencyTest.class,org.nsanelab.prototypes.DependencyTypeTest.class,org.nsanelab.prototypes.GenericComponentTest.class,org.nsanelab.prototypes.TestDOMTest.class,org.nsanelab.prototypes.LibRefTest.class,org.nsanelab.prototypes.LibPropTest.class,org.nsanelab.prototypes.TestJOXTest.class})
public class PrototypesSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}