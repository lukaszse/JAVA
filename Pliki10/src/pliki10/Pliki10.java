/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pliki10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author llser
 */
public class Pliki10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f1, f2;
        Scanner sc;
        PrintWriter pw;
        String tab[];
        String pesel;
        
        
        try{
            f1 = new File("lista.txt");
            f2 = new File("wynik.txt");
            sc = new Scanner(f1);
            pw = new PrintWriter(f2); 
            
            while(sc.hasNextLine()){
                String linia = sc.nextLine();
                tab = linia.split("-");
                

                pesel = tab[2];
                System.out.println("PEESEL   " + pesel);
                
                int plec = Integer.parseInt(String.valueOf(pesel.charAt(9)));
                System.out.println("PLEC " + plec);
                
                int wiek = 2020 - (Integer.parseInt(pesel.substring(0, 2)) + 1900);
                System.out.println("Rok urodzenia: " + wiek);
                
                if(plec%2 == 0)
                    if(wiek>60)
                        pw.println(linia);
                else
                    if(wiek>65)
                        pw.println(linia);
            }
            pw.close();
            sc.close();
        }
        catch(FileNotFoundException ex1){
            System.out.println("Nie znaleziono pliku");
        }
    }
    
}
