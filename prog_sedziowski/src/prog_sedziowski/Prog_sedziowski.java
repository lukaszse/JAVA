/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_sedziowski;

import java.util.Scanner;

/**
 *
 * @author llser
 */
public class Prog_sedziowski {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner skan = new Scanner(System.in);

double oceny[] = new double[10];
double min=0, max=0, sred=0, sum=0;


System.out.println("lets start");

    
System.out.println("-------------------------\nTo jest program sedziowski do obliczania ocen\n------------------\n\n");


for (int sedzia = 0; sedzia < 10; sedzia++){
    int nrSedz = sedzia + 1;

    
    do {
    System.out.println("\nPodaj ocene sedziego nr " + nrSedz + " :");
    oceny[sedzia] = skan.nextDouble(); skan.nextLine();
    if ( oceny[sedzia] < 0 || oceny[sedzia] > 10) {
        System.out.println("podałeś ocene poza skalą, spróbuj raz jeszcze\n");
    }
    } while ((oceny[sedzia] < 0) || (oceny[sedzia] > 10) );
    
    
    sum += oceny[sedzia];
   
    if (sedzia == 0) min = oceny[sedzia];
    
    if (oceny[sedzia] < min ) min = oceny[sedzia];
    
    if (oceny[sedzia] > max ) max = oceny[sedzia];
   
    
}
    sred = (sum - min - max) / 8;

    System.out.println("Srednia po odrzuceniu 2 skrajnych ocen wynosi: " + sred);




        
        
        
    }
    
}
