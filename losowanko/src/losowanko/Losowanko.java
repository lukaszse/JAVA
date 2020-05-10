/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package losowanko;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author llser
 */
public class Losowanko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random r = new Random();
        int wylosowana;
        double losowa;
        wylosowana = r.nextInt(1000);
        System.out.println("Wylosowano liczbę rzeczywistą: " + wylosowana);
        losowa = r.nextDouble();
        System.out.println("Wylosowano liczbę rzeczywistą: " + losowa);
        System.out.println("Iloczyn tych liczb wynosi: " + (losowa * wylosowana) );  
        
        int suma = 0;
        int los;
        
        for (int i=0; i<10; i++){
            los = r.nextInt(25)+1;
            los *= 2;
            System.out.println("Wylosowano liczbę parzystą: " + los);
            suma += los;
            System.out.println("Suma: " + suma);
        }
        
        int liczba;
        int licznik = 1;
        los = r.nextInt(9)+1;
        liczba = Integer.parseInt( JOptionPane.showInputDialog(null, "Podaj liczbę od 1 do 10   ") ) ;
        
        
        do {
        
            if (liczba > 0 && liczba < 10) {
                if (liczba<los) {        
                    liczba = Integer.parseInt( JOptionPane.showInputDialog(null, "Za mala - jeszcze raz   ") ) ;
                    licznik++;
                    } else if (liczba>los){
                    liczba = Integer.parseInt( JOptionPane.showInputDialog(null, "Zaduza jeszcze raz  ") ) ;
                    licznik++;
                }
            } else{
            liczba = Integer.parseInt( JOptionPane.showInputDialog(null, "Podałeś liczbę spoza zakresu od 1 do 10, podaj raz jeszcze   ") ) ;
            licznik++;
            }
            
          } while (liczba != los);
            JOptionPane.showMessageDialog(null, "Zgadłeś za " + licznik + " razem. Ta liczba to właśnie: " + los);   
        
}
}
