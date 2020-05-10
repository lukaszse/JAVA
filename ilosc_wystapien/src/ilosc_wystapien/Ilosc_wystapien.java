/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilosc_wystapien;

import java.util.Scanner;

/**
 *
 * @author llser
 */
public class Ilosc_wystapien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        char znak;
        System.out.println("Podaj znak");
        znak = scan.nextLine().charAt(0);
        int licznik = 0;
        
        String napis = "przykladowy napis testowy aaa";
        
        for(int i=1; i<napis.length(); i++)
            if(znak == napis.charAt(i))
                licznik++;
        
        System.out.println("Liczba wystąpień znaku " + znak + "wynosi: " + licznik);        
        
    }
    
}
