/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lemaf;

import java.util.ArrayList;
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
public class AbstractCarStoreTest {

    public AbstractCarStoreTest() {
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
     * Test of getWeekdayPriece method, of class AbstractCarStore.
     */
    @Test
    public void testGetWeekdayPriece() {
        System.out.println("getWeekdayPriece");
        AbstractCarStore instance = new NorthCar();
        Float expResult = 630f;
        Float result = instance.getWeekdayPriece();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWeekendPriece method, of class AbstractCarStore.
     */
    @Test
    public void testGetWeekendPriece() {
        System.out.println("getWeekendPriece");
        AbstractCarStore instance = new NorthCar();
        Float expResult = 580f;
        Float result = instance.getWeekendPriece();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWeekdayPrieceCostumerCard method, of class AbstractCarStore.
     */
    @Test
    public void testGetWeekdayPrieceCostumerCard() {
        System.out.println("getWeekdayPrieceCostumerCard");
        AbstractCarStore instance = new NorthCar();
        Float expResult = 600f;
        Float result = instance.getWeekdayPrieceCostumerCard();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWeekendPrieceCostumerCard method, of class AbstractCarStore.
     */
    @Test
    public void testGetWeekendPrieceCostumerCard() {
        System.out.println("getWeekendPrieceCostumerCard");
        AbstractCarStore instance = new NorthCar();
        Float expResult = 590f;
        Float result = instance.getWeekendPrieceCostumerCard();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCarType method, of class AbstractCarStore.
     */
    @Test
    public void testGetCarType() {
        System.out.println("getCarType");
        AbstractCarStore instance = new SouthCar();
        CarType expResult = CarType.COMPACT;
        CarType result = instance.getCarType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCapacity method, of class AbstractCarStore.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        AbstractCarStore instance = new NorthCar();
        Integer expResult = 7;
        Integer result = instance.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCars method, of class AbstractCarStore.
     */
    @Test
    public void testGetCars() {
        System.out.println("getCars");
        AbstractCarStore instance = new WestCar();
        instance.addCar(new Car("Ferrari", 2, CarType.SPORTING));
        List<Car> expResult = new ArrayList<>();
        expResult.add(new Car("Ferrari", 2, CarType.SPORTING));
        List<Car> result = instance.getCars();
        assertEquals(expResult, result);
    }

    /**
     * Test of addCar method, of class AbstractCarStore.
     */
    @Test
    public void testAddCar() {
        System.out.println("addCar");
        Car car = new Car("Ferrari-new", 1, CarType.SPORTING);
        AbstractCarStore instance = new WestCar();
        instance.addCar(car);
    }

    /**
     * Test of removeCar method, of class AbstractCarStore.
     */
    @Test
    public void testRemoveCar() {
        System.out.println("removeCar");
        Car car = new Car("Ferrari-new", 1, CarType.SPORTING);
        AbstractCarStore instance = new WestCar();
        instance.addCar(car);
        instance.removeCar(car);        
        assertEquals(true, instance.getCars().isEmpty());
    }

    /**
     * Test of allocateCar method, of class AbstractCarStore.
     */
    @Test
    public void testAllocateCar() {
        System.out.println("allocateCar");
        Integer capacity = 2;
        AbstractCarStore instance = new WestCar();
        
        instance.addCar(new Car("Ferrari-new", 1, CarType.SPORTING));
        instance.addCar(new Car("Ferrari", 2, CarType.SPORTING));
        
        Car expResult = new Car("Ferrari", 2, CarType.SPORTING);
        Car result = instance.allocateCar(capacity);
        assertEquals(expResult, result);
    }

    /**
     * Test of ordenate method, of class AbstractCarStore.
     */
    @Test
    public void testOrdenate() {
        System.out.println("ordenate");
        AbstractCarStore instance = new SouthCar();
        instance.addCar(new Car("Palio-4", 4, CarType.COMPACT));
        instance.addCar(new Car("Palio-3", 3, CarType.COMPACT));
        instance.addCar(new Car("Palio-2", 2, CarType.COMPACT));
        instance.ordenate();
        
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Palio-2", 2, CarType.COMPACT));
        cars.add(new Car("Palio-3", 3, CarType.COMPACT));
        cars.add(new Car("Palio-4", 4, CarType.COMPACT));
        assertEquals(cars, instance.getCars());
    }

    public class AbstractCarStoreImpl extends AbstractCarStore {

        public AbstractCarStoreImpl() {
            super(null, null, null, null, null);
        }
    }

}
