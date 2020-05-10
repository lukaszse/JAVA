/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author llser
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 123456;
        int num2 = 12321;
        
        System.out.println(isPalindrome(num));
        System.out.println(isPalindrome(num2));
    }
    

    public static boolean isPalindrome(int number){
        if(number<0)
            number = number * -1;
        
        int numTemp = number;
        int palindrome = 0;
        
        while(numTemp>0){
            palindrome *= 10;
            palindrome = (numTemp % 10) + palindrome;
            numTemp=  numTemp / 10;
        }
            
        return (number == palindrome);
        
    }

    
}
