/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedconventer;


public class SpeedConventer {

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0)
            return -1;
        else
            return(Math.round(kilometersPerHour/1.609));
    }
    
    public static void printConversion(double kilometersPerHour){
        
        if((toMilesPerHour(kilometersPerHour)) < 0)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour + " = " + (toMilesPerHour(kilometersPerHour)));
    }
}
