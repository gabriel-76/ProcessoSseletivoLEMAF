/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lemaf;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/**
 *
 * @author Gabriel
 */
public class CarRental {

    private List<AbstractCarStore> stores;

    public CarRental() {
        stores = new ArrayList<>();
        stores.add(new SouthCar());
        stores.add(new WestCar());
        stores.add(new NorthCar());
//        System.out.println(stores.toString() + "\n");
    }

    public void addCar(Car car) {
        switch (car.getType()) {
            case COMPACT:
                stores.get(0).addCar(car);
                break;
            case SPORTING:
                stores.get(1).addCar(car);
                break;
            case SUV:
                stores.get(2).addCar(car);
                break;
            default:
                break;
        }

    }

    public String toAllocate(String clientType, Integer qtd, List<DayType> dayTypes) {
//        for (AbstractCarStore cs : stores) {
//            System.out.println(cs.getCapacity());
//        }
//        System.out.println();

        int storePosition = 0;
        float price = Float.MAX_VALUE;
        int i = 0;
        int invalid = 0;

        ArrayList<Entry<Integer, Float>> entrys = new ArrayList<>();

        for (AbstractCarStore cs : stores) {
            if (cs.getCapacity() >= qtd) {
                float currentPrice = 0f;
                for (DayType dt : dayTypes) {
                    if (dt.equals(DayType.WEEKDAY)) {
                        if (clientType.equals("Normal")) {
                            currentPrice += cs.getWeekdayPriece();
                        } else {
                            currentPrice += cs.getWeekdayPrieceCostumerCard();
                        }
                    } else {
                        if (clientType.equals("Normal")) {
                            currentPrice += cs.getWeekendPriece();
                        } else {
                            currentPrice += cs.getWeekendPrieceCostumerCard();
                        }
                    }
                }

                entrys.add(new SimpleEntry<>(i, currentPrice));
//                System.out.println("cur =>" + currentPrice);
                if (currentPrice < price) {
                    price = currentPrice;
                    storePosition = i;
                }
            } else {
                invalid++;
            }
            i++;
        }

//        System.out.println(entrys.toString());

        if (entrys.isEmpty()) {
            return "none:NONE";
        }

        Collections.sort(entrys, (Entry<Integer, Float> t, Entry<Integer, Float> t1) -> t.getValue().compareTo(t1.getValue()));

//        System.out.println(entrys.toString());
//        System.out.println();

        AbstractCarStore store = null;
        Car car = null;

        for (Entry<Integer, Float> en : entrys) {
            store = stores.get(en.getKey());
            car = store.allocateCar(qtd);
            if(car != null){
                break;
            }
        }

        if (invalid == stores.size() || car == null) {
            return "none:NONE";
        }

        return car.toString() + ":" + store.toString().toUpperCase();
    }

}
