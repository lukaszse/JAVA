/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funkcje4;

import java.util.Scanner;

/**
 *
 * @author llser
 */
public class Funkcje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double paliwo, zużycie;
        System.out.println("Podaj ilość paliwa w baku w litrach: ");
        paliwo = sc.nextDouble(); sc.nextLine();
        System.out.println("Podaj zużycie l/100km: ");
        double zuzycie = sc.nextDouble(); sc.nextLine();
        double zasieg = zasieg(paliwo, zuzycie);
        System.out.println("Zasięg dla podanych parametrów wynosi = " + zasieg);
        
        System.out.println("Podaj prędkość: ");
        double predkosc = sc.nextDouble(); sc.nextLine();
        System.out.println("Podaj dystans do przejechania: ");
        double dystans = sc.nextDouble(); sc.nextLine();
        System.out.println("Czas dojazdu = " + czasDojazdu(predkosc, dystans) + " godzin");
        

    }

public static double zasieg (double paliwoWBaku, double nominalneZuzycie){
    return paliwoWBaku / nominalneZuzycie * 100;
}    

public static double czasDojazdu (double predkosc, double dystans){
    return dystans / predkosc;
}
    

}
}
