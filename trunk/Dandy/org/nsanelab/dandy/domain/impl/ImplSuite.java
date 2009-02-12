/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.domain.impl;

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
@Suite.SuiteClasses({org.nsanelab.dandy.domain.impl.GenericCompTest.class,org.nsanelab.dandy.domain.impl.CycleFinderFactoryTest.class,org.nsanelab.dandy.domain.impl.GenericCompFactoryTest.class,org.nsanelab.dandy.domain.impl.SharedRefCycleFinderFactoryBuilderTest.class,org.nsanelab.dandy.domain.impl.SharingDependencyTest.class,org.nsanelab.dandy.domain.impl.GenericCompFactoryBuilderTest.class,org.nsanelab.dandy.domain.impl.test.TestSuite.class,org.nsanelab.dandy.domain.impl.UDCDependencyTest.class,org.nsanelab.dandy.domain.impl.DcUsageCycleFinderFactoryBuilderTest.class,org.nsanelab.dandy.domain.impl.DependencyInfoTest.class})
public class ImplSuite {

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