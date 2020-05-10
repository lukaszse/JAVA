/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pliki8;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

public class Pliki8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f1, f2, f3, f4;
        String linia;
        String[] tab;
        Scanner sc, sc2;
        PrintWriter pw;
        int srednia = 0;
        int index = 0;
        FileOutputStream fos;
        DataOutputStream dos;
        
        try{
            f1 = new File("liczby.txt");
            f2 = new File("wynik.txt");
            f3 = new File("binarny.txt");
            f4 = new File("binrny2.txt");
            sc = new Scanner(f1);
            pw = new PrintWriter(f2); 
            fos = new FileOutputStream(f3);
            dos = new DataOutputStream(fos);
            
             while(sc.hasNextLine()){
                linia = sc.nextLine();
                tab = linia.split(";");
                
                srednia = 0;
                for(String st : tab){
                    srednia += Integer.parseInt(st);
                    dos.writeInt(Integer.parseInt(st));
                    System.out.println("liczba: " + Integer.parseInt(st));
                }
                 System.out.println("Srednia: " + srednia);
                 index++;
                 pw.println("Srednia liczb w linii nr " + index + ": " + srednia);
             }
             pw.close();
             dos.close();
             fos.close();
             
             sc2 = new Scanner(f3);
             fos = new FileOutputStream(f4);
             dos = new DataOutputStream(fos);
             
            srednia = 0; 
            while(sc2.hasNextInt()){
                srednia += sc.nextInt();
             }
             
             while(sc2.hasNextInt()){
                 int liczba = sc2.nextInt();
                 System.out.println("Liczba: " + liczba);
                 if(liczba>srednia){
                    dos.writeInt(liczba);
                     System.out.println("liczba: " + liczba);
                 }
             }
             
             dos.close();
             fos.close();
             
        }
        
        catch(FileNotFoundException ex1){
            System.out.println("Brak pliku");
        }
        
        catch(Exception ex2){
            System.out.println("Wystąpił nieznany błąd");
        }
        
        
    }
    
}
