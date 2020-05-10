/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

/**
 *
 * @author llser
 */
public class JavaApplication39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.760, 3.761);
    }
    
    public static boolean areEqualByThreeDecimalPlaces(double first, double second){
        int firstInt =  (int) (first *1000);
        int secondInt = (int) (second*1000);
        System.out.println("first = " + first);
        System.out.println("firstInt = " + firstInt);
        System.out.println("second = " + second);
        System.out.println("secondInt = " + secondInt);
        
        return firstInt == secondInt;
    }
    
}
