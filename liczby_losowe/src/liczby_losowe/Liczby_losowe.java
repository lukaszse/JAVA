/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liczby_losowe;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author llser
 */
public class Liczby_losowe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int tablica[] = new int[20];
        
        for(int i=0; i<20; i++){
            tablica[i] = rand.nextInt(20) * 5;
            //System.out.println("Liczba " + (i+1) + ": " + liczba + "\n");
        }
        System.out.println("Tablica: " + Arrays.toString(tablica));
        
        System.out.println("\nilosc znakow" + ('z'-'a'+1));

    

//----------------------------------------------

    int losowa, licznik = 0;
    int tab[] = new int[20];
    boolean znaleziona;
    
    do {
        losowa = rand.nextInt(100);
        znaleziona = false;
        
        for(int i=0; i<licznik; i++)
            if(tab[i] == losowa){
                znaleziona = true;
                break;
            }  
        if (znaleziona) continue;
            tab[licznik++] = losowa;
    } while (licznik < 20);
    
    Arrays.sort(tab);
    System.out.println("Tablica: " + Arrays.toString(tab));
    
    
    //----------------------------------
    
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPodaj ciag znaków: ");
        String napis = scan.nextLine();
        int licz_znak = 0;
       
        System.out.println("\nPodałeś: " + napis);
        
        for(int i=0; i<napis.length(); i++)
            if(napis.toLowerCase().charAt(i) == 'a') 
                licz_znak++;
            
        System.out.println("\nliterka a wystąpiła:" + licz_znak + " razy");
               
    
    //--------------------------------

        System.out.println("\nPodaj ciag znaków: ");
        napis = scan.nextLine();
        licz_znak = 0;
       
        System.out.println("\nPodałeś: " + napis);
        
        for(int i=0; i<napis.length(); i++)
            if(napis.toLowerCase().charAt(i) < 'a' || napis.toLowerCase().charAt(i) > 'z' ) 
                licz_znak++;
            
        System.out.println("\nznaki niebedace literami wystąpiły: " + licz_znak + " razy");
        
    //---------------------------------------
    
        System.out.println("\nPodaj ciag znaków: ");
        napis = scan.nextLine();
        licz_znak = 0;
       
        System.out.println("\nPodałeś: " + napis);
        
        for(int i=0; i<napis.length(); i++)
            if(napis.toLowerCase().charAt(i) < 'a' || napis.toLowerCase().charAt(i) > 'z' ) 
                licz_znak++;
            
        System.out.println("\nznaki niebedace literami wystąpiły: " + licz_znak + " razy");;
        
        
        int[] tabliczka = new int[26];
            for(int i=0; i<napis.length(); i++){
                if (napis.toLowerCase().charAt(i) >= 'a' && napis.toLowerCase().charAt(i) <= 'z')
                    tabliczka[napis.toLowerCase().charAt(i)-'a']++;
            }
        System.out.println("\n" + Arrays.toString(tabliczka));
        
    }
}
    
  
    

