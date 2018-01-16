/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lemaf;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alcance
 */
public class NorthCarTest {
    
    public NorthCarTest() {
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
     * Test of toString method, of class NorthCar.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        NorthCar instance = new NorthCar();
        String expResult = "NorthCar";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
