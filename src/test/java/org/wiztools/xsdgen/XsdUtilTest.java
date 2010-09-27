package org.wiztools.xsdgen;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author subWiz
 */
public class XsdUtilTest {

    public XsdUtilTest() {
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
     * Test of parse method, of class XsdUtil.
     */
    @Test
    public void testParse() throws Exception {
        System.out.println("parse");
        File file = new File("src/test/resources/tv.xml");
        new XsdUtil().parse(file);
    }

    @Test
    public void testParseRepeat() throws Exception {
        System.out.println("parse");
        File file = new File("src/test/resources/bathroom.xml");
        new XsdUtil().parse(file);
    }

    @Test
    public void testParseAttributes() throws Exception {
        System.out.println("parse");
        File file = new File("src/test/resources/attr.xml");
        new XsdUtil().parse(file);
    }

    @Test
    public void testParseNoNamespace() throws Exception {
        System.out.println("parse");
        File file = new File("src/test/resources/no-namespace.xml");
        new XsdUtil().parse(file);
    }
}