/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lemaf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author alcance
 */
abstract class AbstractCarStore {

    protected Float weekdayPriece;
    protected Float weekendPriece;
    protected Float weekdayPrieceCostumerCard;
    protected Float weekendPrieceCostumerCard;
    protected CarType carType;
    protected Integer capacity = 0;
    private List<Car> cars;

    public AbstractCarStore(Float weekdayPriece, Float weekendPriece, Float weekdayPrieceCostumerCard, Float weekendPrieceCostumerCard, CarType carType) {
        this.weekdayPriece = weekdayPriece;
        this.weekendPriece = weekendPriece;
        this.weekdayPrieceCostumerCard = weekdayPrieceCostumerCard;
        this.weekendPrieceCostumerCard = weekendPrieceCostumerCard;
        this.carType = carType;
        setCapacity(carType);
        cars = new ArrayList<>();
    }

    public Float getWeekdayPriece() {
        return weekdayPriece;
    }

    public Float getWeekendPriece() {
        return weekendPriece;
    }

    public Float getWeekdayPrieceCostumerCard() {
        return weekdayPrieceCostumerCard;
    }

    public Float getWeekendPrieceCostumerCard() {
        return weekendPrieceCostumerCard;
    }

    public CarType getCarType() {
        return carType;
    }

    public Integer getCapacity() {
        return capacity;
    }

    private void setCapacity(CarType carType) {
        switch (carType) {
            case COMPACT:
                this.capacity = 4;
                break;
            case SPORTING:
                this.capacity = 2;
                break;
            case SUV:
                this.capacity = 7;
                break;
            default:
                break;
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        if (car.getType().equals(carType)) {
            cars.add(car);
        }
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }
    
    public Car allocateCar(Integer capacity){
        for(Car c : cars){
            if(c.getCapacity() >= capacity){
                return c;
            }
        }
        return null;
    }

    private void ordenate(){
        Collections.sort(cars, new CarCompare());
    }
}
