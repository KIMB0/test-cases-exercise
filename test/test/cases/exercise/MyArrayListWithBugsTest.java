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
        System.out.println("Object should be added");
        Object o = null;
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        instance.add(o);
        expResult = 1;
        int result2 = instance.size();
        assertEquals(expResult, result2);
    }

    /**
     * Test of size method, of class MyArrayListWithBugs.
     */
    @Test
    public void testSize() {
        System.out.println("Size should be 0");
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class MyArrayListWithBugs.
     */
    @Test
    public void testGet() {
        System.out.println("Get index number 0");
        int index = 0;
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        Object expResult = null;
        instance.add(expResult);
        Object result = instance.get(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class MyArrayListWithBugs.
     */
    @Test
    public void testAdd_int_Object() {
        System.out.println("Add object at index 0");
        int index = 0;
        Object o = null;
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        instance.add(index, o);
    }

    /**
     * Test of remove method, of class MyArrayListWithBugs.
     */
    @Test
    public void testRemove() {
        System.out.println("Remove object at index 0");
        int index = 0;
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        Object object = null;
        instance.add(object);
        instance.remove(index);
        int expectedRes = instance.size();
        assertEquals(expectedRes, index);
    }
    
}
