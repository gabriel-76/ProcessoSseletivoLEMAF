/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lemaf;

import java.util.Comparator;

/**
 *
 * @author Gabriel
 */
public class CarCompare implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
       return car1.getCapacity().compareTo(car2.getCapacity());
    }

}
