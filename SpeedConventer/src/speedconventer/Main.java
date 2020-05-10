/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedconventer;

/**
 *
 * @author llser
 */
public class Main {
    
    public static void main(String[] args){
        System.out.println("test");
        
        long mileNh = SpeedConventer.toMilesPerHour(100);
        
        
        System.out.println("Mile / h :" + mileNh);
        
        System.out.println((5/3)) ;
        
        int kiloBytes = 2500;
        System.out.println( kiloBytes + " KB = " + (kiloBytes/1024) + " MB and " + (kiloBytes%1024) + " KB" );
    }
    
}
