/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import lemaf.Car;
import lemaf.CarRental;
import lemaf.CarType;
import lemaf.DayType;

/**
 *
 * @author Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "Normal:4:16Mar2009(seg)17Mar2009(ter)18Mar2009(qua)";

        String[] data = input.split(":");
        
//        System.out.println();
//        System.out.println(data[0]);
//        System.out.println(data[1]);

        String[] dayTypesString = data[2].split("\\(");
        ArrayList<DayType> dayTypes = new ArrayList<>();

        for (int i = 1; i < dayTypesString.length; i++) {
            String s = dayTypesString[i];
//            System.out.println(s);
//            System.out.println(s.substring(0,3));
            dayTypes.add(DayType.getInstance(s.substring(0,3)));
        }
        
//        System.out.println();

        CarRental carRental = new CarRental();
        carRental.addCar(new Car("Ferrari", 2, CarType.SPORTING));
        carRental.addCar(new Car("SW4", 6, CarType.SUV));
        carRental.addCar(new Car("Palio", 3, CarType.COMPACT));

        
        System.out.println(carRental.toAllocate(data[0], Integer.parseInt(data[1]), dayTypes));
    }

}
