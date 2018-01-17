/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lemaf;

import java.util.List;
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
public class CarRentalTest {
    
    public CarRentalTest() {
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
     * Test of addCar method, of class CarRental.
     */
    @Test
    public void testAddCar() {
        System.out.println("addCar");
        Car car = null;
        CarRental instance = new CarRental();
        instance.addCar(car);
    }

    /**
     * Test of toAllocate method, of class CarRental.
     */
    @Test
    public void testToAllocate() {
        System.out.println("toAllocate");
        String clientType = "";
        Integer qtd = null;
        List<DayType> dayTypes = null;
        CarRental instance = new CarRental();
        String expResult = "";
        String result = instance.toAllocate(clientType, qtd, dayTypes);
        assertEquals(expResult, result);
    }
    
}
