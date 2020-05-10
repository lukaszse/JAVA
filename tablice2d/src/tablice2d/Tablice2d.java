
package tablice2d;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Tablice2d {


    public static void main(String[] args) {
        Random r = new Random();
        int[][] tt = new int[9][9];
        
        for(int i=0; i < tt.length; i++)
            for(int j=0; j < tt[i].length; j++)
                if (i==j || i+j== tt[i].length-1)
                    tt[i][j]=1;
        
        
        for(int i=0; i < tt.length; i++)
            System.out.println(Arrays.toString(tt[i]));
        
        //--------------------------------------------------
        
        Scanner sc = new Scanner(System.in);
        double[][] t = new double [2][3];
        
        System.out.println("\n\nObliczamy układ równań: \n a1*x + b1*y = c1 \n a2*x + b2+y = c2/n/n");
        System.out.println("Podaj a1");
        t[0][0] = sc.nextDouble(); sc.nextLine();
        System.out.println("Podaj b1");
        t[0][1] = sc.nextDouble(); sc.nextLine();
        System.out.println("Podaj c1");
        t[0][2] = sc.nextDouble(); sc.nextLine();
        
        System.out.println("Podaj a2");
        t[1][0] = sc.nextDouble(); sc.nextLine();
        System.out.println("Podaj b2");
        t[1][1] = sc.nextDouble(); sc.nextLine();
        System.out.println("Podaj c2");
        t[1][2] = sc.nextDouble(); sc.nextLine();
        
        double W = t[0][0] * t[1][1] - t[0][1] * t[1][0];
        double Wx = t[0][2] * t[1][1] - t[0][1] * t[1][2];
        double Wy = t[0][0] * t[1][2] - t[0][2] * t[1][0];
        double x;
        double y;
        
        
        if(W != 0){
            x = Wx / W;
            y = Wy / W;
            System.out.println("   x = " + x);
            System.out.println("   y = " + y );
            System.out.println("\n");
        } else if (W == 0 && Wx == 0 && Wy == 0){
            System.out.println("Układ jest nieoznaczony - posiada nieskończenie wiele rozwiązań");
        } else if (W == 0 && Wx != 0 || Wy != 0){
            System.out.println("Układ jest sprzeczny - nie posiada rozwiązań");
        }
            
                    
            
        
        
        
        
   
    }
    
}
