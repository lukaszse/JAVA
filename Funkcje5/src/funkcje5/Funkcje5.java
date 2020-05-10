
package funkcje5;

import java.util.Random;
import java.util.Arrays;

public class Funkcje5 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] tab = new int[40];
        
        
        for(int i=0; i<tab.length; i++){
            tab[i] = r.nextInt(100);
        }
        
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(mniejsze(tab)));
    }
    
    public static int[] mniejsze (int[] tablica){
        int suma = 0, srednia, wielkoscTab=0;
        
        for( int x : tablica)
            suma += x;
        
//        for(int i=0; i<tablica.length; i++)
//            suma += tablica[i];
        
        srednia = suma / tablica.length;
        
        for(int i=0; i<tablica.length; i++)
            if(tablica[i] > srednia)
                wielkoscTab++;
        
        int[] tabMniejsze = new int[wielkoscTab];
        
        int j=0;
        for(int i=0; i<tablica.length; i++)
            if(tablica[i] > srednia){
                tabMniejsze[j] = tablica[i];
                j++;
            }
        return tabMniejsze;
    }
}



