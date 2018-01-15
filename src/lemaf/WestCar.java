/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lemaf;

/**
 *
 * @author alcance
 */
public class WestCar extends AbstractCarStore{
    
    public WestCar() {
        super(530f, 150f, 200f, 90f, CarType.SPORTING);
    } 

    @Override
    public String toString() {
        return "WestCar";
    }
    
    
}
