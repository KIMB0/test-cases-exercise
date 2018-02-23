/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.cases.exercise;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kim
 */
public class MyArrayListWithBugsTest {
    
    public MyArrayListWithBugsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class MyArrayListWithBugs.
     */
    @Test
    public void testAdd_Object() {
        System.out.println("add");
        Object o = null;
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        instance.add(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class MyArrayListWithBugs.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class MyArrayListWithBugs.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        Object expResult = null;
        Object result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class MyArrayListWithBugs.
     */
    @Test
    public void testAdd_int_Object() {
        System.out.println("add");
        int index = 0;
        Object o = null;
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        instance.add(index, o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class MyArrayListWithBugs.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int index = 0;
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        Object expResult = null;
        Object result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
