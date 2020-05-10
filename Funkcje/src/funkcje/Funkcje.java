/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funkcje;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author llser
 */
public class Funkcje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 11, b = 22;
        zwieksz(a, b);
        System.out.println("suma a + b = " + suma(a, b));
        System.out.println("wieksza liczba: " + wieksza(a, b));
        int[] tab = new int[20];
        wypelnijTablice(tab);
        System.out.println(Arrays.toString(tab));
    }
    
    public static void wypelnijTablice(int[] tablica){
        Random rand = new Random();
        for (int i = 0; i < tablica.length; i++){
            tablica[i] = rand.nextInt(50);
        }  
    }
    
    public static void zwieksz (int a, int b){
        System.out.println("Początek funkcji");
        a +=10; b +=10;
        System.out.println("a = " + a + " b = " + b);
        System.out.println("Koniec funkcji");
    }
    
    public static int suma (int a, int b){
        int wynik = a + b;
        return wynik;
    }
    
    public static int wieksza (int a, int b){
        return a > b ? a : b;
    }
}
