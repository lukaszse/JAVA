/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyniki.biegacza;

import javax.swing.JOptionPane;

/**
 *
 * @author llser
 */
public class WynikiBiegacza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double czas, suma=0;
        int licznik=1;
        
        do {
        czas = Double.parseDouble(JOptionPane.showInputDialog("podaj czas " + licznik + " okrazenia w sekudnach, lub wprowadź 0 jeśli chcesz zakończyć"));
        
        if (czas > 0) { 
            
            suma += czas;
            licznik++;
        } 
        
        
        } while ( czas != 0 );
        
        
        JOptionPane.showMessageDialog(null, "Sumaryczny czas to: " + suma + " sekund.");
        
        
    }
    
}
