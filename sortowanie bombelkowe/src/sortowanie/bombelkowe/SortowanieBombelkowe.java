
package sortowanie.bombelkowe;

import java.util.Arrays;
import java.util.Random;

public class SortowanieBombelkowe {

    public static void main(String[] args) {

        Random r = new Random();
        int tab[];
        tab = new int[10];
        int temp;   
        
        for (int i=0; i<10; i++) {
            tab[i] = r.nextInt(10)+1; //losuje liczbę od 1 do 10.
        }
        System.out.println("Oto twoja tablica liczb losowych: " + Arrays.toString(tab));
        System.out.println("Ta tablica ma długość:  " + tab.length);
    
        for (int i=0; i<tab.length; i++){
        for(int j=0; j<tab.length-1; j++){
            if ( tab[j] > tab[j+1] ){
                temp = tab[j+1];
                tab[j+1]=tab[j];
                tab[j]=temp;
            }
        }
    }
    System.out.println("Po sorcie: " + Arrays.toString(tab)); 
    
    }
    
}
