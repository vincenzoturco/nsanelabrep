/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.usecase.impl;

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
@Suite.SuiteClasses({org.nsanelab.dandy.usecase.impl.ExportImageTest.class,org.nsanelab.dandy.usecase.impl.SharedRefCycleFinderTest.class,org.nsanelab.dandy.usecase.impl.NW70GraphTest.class,org.nsanelab.dandy.usecase.impl.GraphCycleFinderTest.class,org.nsanelab.dandy.usecase.impl.DCDepCycleFinderTest.class})
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