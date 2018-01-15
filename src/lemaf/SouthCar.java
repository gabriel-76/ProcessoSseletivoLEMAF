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
public class SouthCar extends AbstractCarStore{

    public SouthCar() {
        super(210f, 150f, 200f, 90f, CarType.COMPACT);
    } 

    @Override
    public String toString() {
        return "SouthCar";
    }
    
    

}
