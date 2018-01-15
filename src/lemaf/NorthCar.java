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
public class NorthCar extends AbstractCarStore{
    
    public NorthCar() {
        super(630f, 580f, 600f, 590f, CarType.SUV);
    } 

    @Override
    public String toString() {
        return "NorthCar";
    }
    
    
    
    
}
