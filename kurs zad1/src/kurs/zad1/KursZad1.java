/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurs.zad1;

/**
 *
 * @author llser
 */
public class KursZad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("22: " + sumFirstAndLastDigit(22));
        System.out.println("452239: " + sumFirstAndLastDigit(452239));
        
        System.out.println("452239: " + getEvenDigitSum(1226));
    }
    
    
    public static int sumFirstAndLastDigit(int number){
        
        if(number<0)
            return -1;
        
        int sum = number%10;
        
        while(number>0){
            if(number/10 == 0)
                sum += number;
            number = number/10;
        }

        return sum;
    }
    
        public static int getEvenDigitSum(int number){
        if(number<0)
            return -1;
        
        int evenSum = 0;
        
        while(number>0){
            if((number%10)%2 == 0)
                evenSum += (number%10);
            number = number/10;
        }
        
        return evenSum;
    }
}
    
