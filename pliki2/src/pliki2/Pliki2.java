/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pliki2;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author llser
 */
public class Pliki2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f;
        Scanner sc;
        int suma = 0;
        int liczba;
        
        try{
            f = new File("liczby.txt");
            sc = new Scanner(f);
            
            while(sc.hasNextInt()){
                liczba = sc.nextInt();
                suma += liczba;
                System.out.println("liczba: " + liczba);
            }
            System.out.println("Suma liczb: " + suma);
                    
        }catch(FileNotFoundException ex){
            System.out.println("Brak pliku");
    }
    }
}
    

