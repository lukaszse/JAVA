/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaliczenie_1;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author llser
 */
public class Zaliczenie_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rand = new Random();
        
        int tab[] = new int [25];
        
        for (int i=0; i<25; i++){
            tab[i] = rand.nextInt(100)+100;  
        }
    
    Arrays.sort(tab);
    
    int mediana = (tab.length/2); //poniewaz tablica zawiera nieparzysta liczbę elementów
    
    System.out.println("Posortowana tablica: " + Arrays.toString(tab));
    System.out.println("Mediana: " + mediana);
    
    
    
  //---------zadanie 2-------------------
  System.out.println("\n----------Zadanie 2---------");
    String dane = "97.27;5.33;11.0;157";
    String[] daneT = dane.split(";");
    double daneLiczb[] = new double[daneT.length];
    double suma = 0, srednia;
    
    for(int i=0; i<daneLiczb.length; i++)
        daneLiczb[i] = Double.parseDouble(daneT[i]);
    
    for(int i=0; i<daneLiczb.length; i++)
        suma += daneLiczb[i];
   
    srednia = suma/daneLiczb.length;
    
    System.out.println("Dane w tablicy liczb: " + Arrays.toString(daneLiczb));
    System.out.println("Suma: " + suma);
    System.out.println("Średnia: " + srednia);

        
    }
    
}
