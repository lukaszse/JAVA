
package przeliczanie_jednostek;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Przeliczanie_jednostek {

    public static void main(String[] args) {
        
        Scanner skaner = new Scanner(System.in);
        double metry, stopy, temperatura;
        int przelacznik;
        String temp;
        
        
        przelacznik = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj co chcesz konwertowac: \n1 - metry na stopy, \n2 - stopy na metry, \n3 - stopnie °C na stopnie K :"));
    
        if( przelacznik == 1 ){
            metry = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj długośc w metrach :"));
            stopy = 3.2808399 * metry;
            JOptionPane.showMessageDialog(null, "Podałeś " + metry + " m, a to jest dokładnie " + stopy + " stóp");
        } else if ( przelacznik == 2 ) {
            stopy = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj długośc w stopach :"));
            metry = stopy / 3.2808399;
            JOptionPane.showMessageDialog(null, "Podałeś " + stopy + " stóp, a to jest dokładnie " + metry + " metrów");
        } else if ( przelacznik == 3 ) {
            JOptionPane.showMessageDialog(null, "a teroz se wpisz w konsoli nie w okienku, dla odmiany");
            System.out.println("Podaj temperature w stopniach °C");
            temperatura = skaner.nextDouble(); skaner.nextLine();
            System.out.println("Podałeś " + temperatura + " °C, a to jest dokładnie " + (temperatura + 273.15) +" K");
        }
        
        JOptionPane.showMessageDialog(null, "tym samym chcesz czy nie chcesz, program kończy swój żywot");
    
}
}
