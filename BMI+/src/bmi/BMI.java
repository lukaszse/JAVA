
package bmi;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class BMI {


    public static void main(String[] args) {
        // TODO code application logic here
        
        double masa, wzrost, bmi;
        
        Scanner skan = new Scanner (System.in);
        System.out.println("Podaj masę swojego ciała w kilogramach: ");
        masa = skan.nextDouble(); skan.nextLine();
        System.out.println("Podałeś: " + masa + " kg");
        System.out.println("Podaj swój wzrost w centymetrach: ");
        wzrost = skan.nextDouble(); skan.nextLine();
        System.out.println("Podałeś: " + wzrost + " cm\n");
        wzrost = wzrost / 100;
        System.out.println("A to jest " + wzrost + " metra");
        bmi =  masa / (wzrost * wzrost);
 
        System.out.println("Twoje BMI wynosi: " + bmi + "\n");
        
        if( bmi < 20){
            System.out.println("Człowieku, jesteś chudy jak szkielet!\n");
        } else if ( bmi > 25 && bmi < 30 ){
            System.out.println("Idziesz 'na masę'?\n");
        } else if ( bmi > 30) {
            System.out.println("Człowieku, trzeba by ograniczyć żarcie, nie sądzisz?\n");
        } else {
            System.out.println("Twoja masa jest w normie\n\n");
        }
   
}
}