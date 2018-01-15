/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lemaf;

/**
 *
 * @author Gabriel
 */
public enum DayType {
    WEEKDAY, WEEKEND;
    
    public static DayType getInstance(String day){
        if(day.equals("seg") || day.equals("ter") || day.equals("qua") || day.equals("qui") || day.equals("sex") ){
            return WEEKDAY;
        } else if(day.equals("sab") || day.equals("dom")){
            return WEEKEND;
        }
        return null;
    }
}
