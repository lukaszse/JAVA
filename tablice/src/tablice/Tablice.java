
import java.util.*;


public class Tablice {


    public static void main(String[] args) {

        Random r = new Random();
        int tab[];
        tab = new int[10];
        int min =0, max=0, suma = 0, temp; 
        double srednia = 0;
        
        for (int i=0; i<10; i++) {
            tab[i] = r.nextInt(10)+1;
        }
    
    System.out.println("Oto twoja tablica liczb losowych: " + Arrays.toString(tab));
    
    for (int i=0; i<tab.length; i++) {
        if (i==0){
            min = tab[0];
            max = tab[0];
        } else if (min>tab[i]) {
            min = tab [i];
        } else if (max<tab[i]){
            max = tab[i]; 
        }         
        suma += tab[i];
        double suma2 = suma;
        srednia = suma2 / tab.length;
    }
    
    for (int i=0; i<tab.length; i++){
        for(int j=0; j<tab.length-1; j++){
            if ( tab[j] > tab[j+1] ){
                temp = tab[j+1];
                tab[j+1]=tab[j];
                tab[j]=temp;
            }
        }
    }
    
    System.out.println("Po segregacji: " + Arrays.toString(tab));
    System.out.println("Suma: " + suma);
    System.out.println("Średnia: " + srednia);
    System.out.println("min: " + min);
    System.out.println("max: " + max);
    }
    
}
