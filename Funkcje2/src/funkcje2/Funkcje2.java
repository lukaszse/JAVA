/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funkcje2;

import java.util.Scanner;

/**
 *
 * @author llser
 */
public class Funkcje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wybor;
        do{
            System.out.println("1 - kwadrat");
            System.out.println("2 - kolo");
            System.out.println("3 - prostokąt");
            System.out.println("10 - wyjście");
            wybor = scan.nextInt(); scan.nextLine();
            switch (wybor){
                case 1: obliczeniaDlaKwadratu(); break;
                case 3: obliczeniaDlaProstokata(); break;
                case 10: System.out.println("Bye"); break;
                default : System.out.println("Nie ma takiej pozycji");
            } 
        }while(wybor != 10);
    }
    
    
        public static void obliczeniaDlaProstokata(){
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("podaj a: ");
        a = scan.nextInt(); scan.nextLine();
        System.out.println("podaj b: ");
        b = scan.nextInt(); scan.nextLine();
        System.out.println("Pole: " + poleProstokata(a, b));
        System.out.println("Pole: " + obwodProstokata(a, b));

    }
    public static double poleProstokata(int a, int b){
        return a * b;
  
    }
    public static double obwodProstokata(int a, int b){
        return 2*a+2*b;
    }
        public static void obliczeniaDlaKwadratu(){
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("podaj a: ");
        a = scan.nextInt(); scan.nextLine();
        double pole = poleKwadratu(a);
        System.out.println("Pole: " + pole);
        System.out.println("Pole: " + obwodKwadratu(a));
  
    }
    public static double poleKwadratu(int a){
        return a * a;
        
        
    }
    public static double obwodKwadratu(int a){
        return 4*a;
        
    }
}

