/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pliki4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author llser
 */
public class Pliki4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f1;
        File f2;
        PrintWriter pw;
        Scanner sc;
        String linia;
        String[] tab;
        
        try{
            f1 = new File("plik1.txt");
            f2 = new File("plik2.txt");
            sc = new Scanner(f1);
            pw = new PrintWriter(f2);
            
            while(sc.hasNextLine()){
                linia = sc.nextLine();
                tab = linia.split("-");
                if(tab[3].equals("Wies")){
                    int cena = (int) ((Double.parseDouble(tab[1])*0.9)+0.5);
                    tab[1] = Integer.toString(cena);
                    System.out.println(Arrays.toString(tab));
                    String temp="";
                    for(int i=0; i<tab.length; i++){
                        if(i==0)
                            temp += tab[i] + "\t\t";
                        else if(i>0 && i<tab.length-1)
                            temp += tab[i] + "\t";
                        else
                            temp += tab[i];
                    }
                    System.out.println(temp);
                    pw.println(temp);     
                }
            }
            pw.close();
                    
        }catch(FileNotFoundException ex){
            System.out.println("Brak pliku");

        } 
                   String str = "GeeksforGeeks."; 
  
        // Concatenation of two strings 
        String gfg1 = String.format("My Company name is %s", str); 
  
        // Output is given upto 8 decimal places 
        String str2 = String.format("My answer is %10.2f", 47.65734); 
  
        // between "My answer is" and "47.65734000" there are 15 spaces 
        String str3 = String.format("My answer is %10.2f", 47.65734); 
  
        System.out.println(gfg1); 
        System.out.println(str2); 
        System.out.println(str3); 
    }
    
}

