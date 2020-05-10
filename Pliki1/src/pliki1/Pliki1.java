/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pliki1;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author llser
 */
public class Pliki1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f;
        PrintWriter pw;
        try{
            f = new File("plik.txt");
            pw = new PrintWriter(f);
            pw.println("C++ jest wspaniały. Tylko C++");
            pw.println("w C++ można wszystko");
            pw.println("C++ jest najlepszy");
            pw.println("tylko C++");
            pw.close();
        } catch (FileNotFoundException ex){
            System.out.println("Brak pliku");
        }
        
        File f2;
        PrintWriter pw2;
        Scanner sc;
        String bufor;
        try{
            f = new File("plik.txt");
            f2 = new File("plik2.txt");
            pw2 = new PrintWriter(f2);
            sc = new Scanner(f);
            while(sc.hasNextLine()){
                bufor = sc.nextLine();
                System.out.println(bufor);
                bufor = bufor.replace("C++", "JAVA");
                pw2.println(bufor);
            }
            sc.close();
            pw2.close();
        }catch(FileNotFoundException ex){
            System.out.println("Brak pliku");
        }
        

        
        }
    }
   
