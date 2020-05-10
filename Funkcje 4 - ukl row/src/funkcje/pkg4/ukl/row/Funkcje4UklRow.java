/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funkcje.pkg4.ukl.row;

/**
 *
 * @author llser
 */
public class Funkcje4UklRow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] uklRow = new double[2][3];
    }
    
    public static double det(double[][] t){
        return t[0][0] * t[1][1] - t[0][1] * t[1][0];
        
    }
    public static double detX(double[][] t){
        return t[0][2] * t[1][1] - t[0][1] * t[1][2];
        
    }
    public static double detY(double[][] t){
        return t[0][0] * t[1][2] - t[0][2] * t[1][0];
    }
    public static double X(double detX, double det){
        if(det != 0)
            return detX / det;
        else return 0;
    }
    public static double Y(double detY, double det){
        if(det != 0)
            return detY / det;
        else return 0;
    }
            
            
    
}
