/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pliki5;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author llser
 */
public class Pliki5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f1, fk, fm;
        Scanner sc;
        PrintWriter pwk, pwm;
        String[] tab, kobiety, mezczyzni;
        kobiety = new String[2];
        mezczyzni = new String[2];
        
        try{
            f1 = new File ("plik1.txt");
            fk = new File ("kobiety.txt");
            fm = new File ("mezczyzni.txt");
            sc = new Scanner(f1);
            pwk = new PrintWriter(fk);
            pwm = new PrintWriter(fm);
            
            while(sc.hasNextLine()){
                tab = (sc.nextLine()).split("-");
                System.out.println(Arrays.toString(tab));
                if(tab[2].equals("K")){
                    kobiety[0] = tab[1];
                    kobiety[1] = Integer.toString(((65-(Integer.parseInt(tab[3])))*12));
                    for(String x : kobiety)
                        pwk.print(x + "-");
                    pwk.println("");
                } else if(tab[2].equals("M")){
                    mezczyzni[0] = tab[1];
                    mezczyzni[1] = Integer.toString(((67-(Integer.parseInt(tab[3])))*12));
                    for(String x : mezczyzni)
                        pwm.print(x + "-");
                    pwm.println("");
            }
            }
            pwk.close();
            pwm.close();
            
        } catch (FileNotFoundException ex){
            System.out.println("Nie znaleziono pliku");
        }
        
        
    }
    
}
