/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nsanelab.dandy.domain;

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
@Suite.SuiteClasses({org.nsanelab.dandy.domain.impl.ImplSuite.class,org.nsanelab.dandy.domain.EDependencyTimeTest.class})
public class DomainSuite {

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