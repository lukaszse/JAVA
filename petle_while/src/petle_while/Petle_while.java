/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petle_while;

import java.util.Scanner;

/**
 *
 * @author llser
 */
public class Petle_while {

    public static void main(String[] args) {
        int licznik = 0;
        
        while (licznik < 20) {
            licznik ++;
            //if (licznik == 8 ) break;
            //if (licznik > 4) continue;
            
            if (licznik%2 == 0)
            System.out.println("Liczba " + licznik);
        } ;
        
    System.out.println("\n--------------------------- \npo pętli 1 \n\n");
    
    licznik = 0;
    int suma = 0;
    
    while (licznik < 100) {
            licznik ++;
            
            if (licznik%3 == 0) {
                suma += licznik;
                System.out.println("Liczby podzielne przez 3: " + licznik);
        } ;
    };
    
    System.out.println("\n-----------------------\nSuma tych liczb wynosi: " + suma + "\n\n");
    
    
    

//int tab[] = {1, 2, 3, 4, 5, 4, 3, 2, 1};
//for(int val: tab){
//System.out.println(val);
//}
    
Scanner skan = new Scanner(System.in);

double zarobki[] = new double[12];
double min=0, max=0, sred=0, sum=0;


System.out.println("lets start");

for (int miesiac = 0; miesiac < 12; miesiac++){
    int wysw_mies = miesiac + 1;
    System.out.println("\nPodaj twój doch od za " + wysw_mies + " miesiac: ");
    zarobki[miesiac] = skan.nextDouble(); skan.nextLine();
    sum += zarobki[miesiac];
    
    if (miesiac == 1) min = zarobki[miesiac];
    
    if (zarobki[miesiac] < min ) min = zarobki[miesiac];
    
    if (zarobki[miesiac] > max ) max = zarobki[miesiac];
   
    
}
    sred = sum / 12;
    System.out.println("Suma twoich zarobków: " + sum);
    System.out.println("Srednia miesieczna twoich zarobków: " + sred);
    System.out.println("Maksymalny miesieczny zarobek: " + max);
    System.out.println("Minimalny miesieczny zarobek: " + min);




// koniec
    }

}
