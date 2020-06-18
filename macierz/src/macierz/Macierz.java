/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package macierz;
import java.util.Arrays;

/**
 *
 * @author llser
 */
public class Macierz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int[][] A = new int[3][5];
        
        for(int i=0; i<A.length; i++)
            System.out.println(Arrays.toString(A[i]));
        
        System.out.println(A.length);
        System.out.println(A[1].length);
                
    }
    
}
