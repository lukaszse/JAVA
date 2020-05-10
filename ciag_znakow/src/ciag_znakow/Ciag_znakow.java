/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciag_znakow;
import java.util.Arrays;

/**
 *
 * @author llser
 */
public class Ciag_znakow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String napis = "osobowy;audi;2005;14999;czerwony";
        String[] temp = napis.split(";");
        
        int cena = Integer.parseInt(temp[3]);
        double cenatemp;
        cenatemp = cena * 0.9;
        cena = (int) (cenatemp + 0.5);
        
        System.out.println(Arrays.toString(temp));
        System.out.println("\n" + cena);
        System.out.println("\n" + cenatemp);
                
    }
    
}
