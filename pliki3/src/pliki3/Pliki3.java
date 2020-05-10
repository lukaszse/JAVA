/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pliki3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author llser
 */
public class Pliki3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f;
        Scanner sc;
        int suma = 0;
        int liczba;
        String linia;
        
        try{
            f = new File("liczby.txt");
            sc = new Scanner(f);
            
            while(sc.hasNextLine()){
                linia = sc.nextLine();
                String[] tab = linia.split(";");
                
                for(int i=0; i<tab.length; i++){
                    suma += Integer.parseInt(tab[i]);
                    System.out.println("liczba: " + tab[i]);
                }
            }
            System.out.println("Suma liczb: " + suma);
                    
        }catch(FileNotFoundException ex){
            System.out.println("Brak pliku");
    }
    }
    
}
