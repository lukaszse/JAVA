/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testowanie;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author llser
 */
public class Testowanie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        int tab[][] = new int[5][5];
        int tabtemp[] = new int[25];
        

        
        for(int i=0; i<tab.length; i++)
            for(int j=0; j<tab[i].length; j++)
                tab[i][j] = rand.nextInt(100);
        
        for(int i=0; i<tab.length; i++)
            System.out.println(Arrays.toString(tab[i]));

        int licznik = 0;
        for(int i=0; i<tab.length; i++)
            for(int j=0; j<tab[i].length; j++){
                tabtemp[licznik] = tab[i][j];
                licznik++;
            }
        System.out.println("\n");
        System.out.println(Arrays.toString(tabtemp));
        
        for(int i=0; i<tabtemp.length-1; i++)
            for(int j = 0; j<tabtemp.length-1; j++){
                if(tabtemp[j] > tabtemp[j+1]){
                    int temp = tabtemp[j+1];
                    tabtemp[j+1] = tabtemp[j];
                    tabtemp[j] = temp;
                }
            }
                
        System.out.println("\n");
        System.out.println(Arrays.toString(tabtemp));
        
        licznik = 0;
        for(int i=0; i<tab.length; i++)
            for(int j=0; j<tab[i].length; j++){
                tab[i][j] = tabtemp[licznik];
                licznik++;
            }
        
        System.out.println("\n");
        for(int i=0; i<tab.length; i++)
            System.out.println(Arrays.toString(tab[i]));
        
    }
    
}
