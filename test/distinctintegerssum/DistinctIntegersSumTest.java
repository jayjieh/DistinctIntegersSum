/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distinctintegerssum;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owori Juma
 */
public class DistinctIntegersSumTest {
    
    public DistinctIntegersSumTest() {
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
     * Test of getTripletCount method, of class DistinctIntegersSum.
     */
    @Test
    public void testGetTripletCount() {
        System.out.println("getTripletCount");
        int[] arr = {-2, 0, 1, 3};
        int n = arr.length;
        int sum = 2;
        int expResult = 2;
        int result = DistinctIntegersSum.getTripletCount(arr, n, sum);
        assertEquals(expResult, result);        
    }
    
}
