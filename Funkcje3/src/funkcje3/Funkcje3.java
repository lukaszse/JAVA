
package funkcje3;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author llser
 */
public class Funkcje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] t1, t2, t3, t4;
        t1 = new int[5]; t2 = new int[10];
        wypelnijTablice(t1, 0, 10);
        wypelnijTablice(t2, 20, 30);
        System.out.println(Arrays.toString(sumaTablicMniejsza(t1, t2)));
        System.out.println(Arrays.toString(sumaTablicWieksza(t1, t2)));

    }
    
    public static void wypelnijTablice(int[] tab, int a,int b){
        Random losuj = new Random();
        
        for(int i=0; i<tab.length; i++){
            tab[i] = losuj.nextInt(b-a+1)+a;
        }
        System.out.println(Arrays.toString(tab));
        
    }
    
    public static int[] sumaTablicMniejsza(int[] t1, int[] t2){
        int leng;
        int[] suma;
        if (t1.length < t2.length) 
            leng = t1.length;
        else
            leng = t2.length;
        suma = new int[leng];
        for(int i=0; i<leng; i++)
            suma[i] = t1[i] + t2[i];
        return suma;
    }
            public static int[] sumaTablicWieksza(int[] t1, int[] t2){
        int leng;
        int lengk;
        int[] suma;
        if (t1.length > t2.length){ 
            leng = t1.length;
            lengk = t2.length;
        }
        else{
            leng = t2.length;
            lengk = t1.length;
        }
        
        suma = new int[leng];
        for(int i=0; i<leng; i++)
            if (i<lengk)
            suma[i] = t1[i] + t2[i];
            else
            suma[i] = 
        
        return suma;
    
    }
      
}
