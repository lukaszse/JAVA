/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funkje6;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author llser
 */
public class Funkje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] tablica = new int[5][8];
        int punktK = 100;
        Random r = new Random();
       
        for(int i=0; i<tablica.length; i++){
            tablica[i][0] = i+1;
            tablica[i][1] = r.nextInt(40)+punktK;
            
            for(int j=2; j<tablica[i].length-1; j++)
                tablica[i][j] = r.nextInt(10)+1;
            
        }
        
    for(int i=0;i<tablica.length; i++)
        System.out.println(Arrays.toString(tablica[i]));
    }
    
//static void skoki(int tab[][], int K, int P){
    
    //for(int i=0; i<tablica.length; i++){
//        tab[i][2] = 60 + (tab[i][1]-K)
    }
    
    

