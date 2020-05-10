
package tab2d_tab_zawodow;

import java.util.Arrays;
import java.util.Random;


public class Tab2d_tab_zawodow {

    public static void main(String[] args) {
        Random r = new Random();
        double[][] tZaw = new double[5][6];
                
        for(int i = 0; i < tZaw.length; i++)
            for(int j = 0; j < (tZaw[i].length - 1); j++ )
                tZaw[i][j] = r.nextInt(5) + 97;
        
//        for(int i=0; i < tZaw.length; i++)
//            System.out.println(Arrays.toString(tZaw[i]));
//            System.out.println("\n\n\n");
        
        for(int i = 0; i < tZaw.length; i++)
            for(int j = 0; j < (tZaw[i].length - 1); j++ )
                tZaw[i][(tZaw[i].length-1)] += tZaw[i][j];
        
        for(int i=0; i < tZaw.length; i++)
            System.out.println(Arrays.toString(tZaw[i]));
            System.out.println("\n\n\n");
        
        
        
        //---------------------------------------------
        
    int[][] tb = new int[10][10];
    
    int licznik = 0;
    for(int i=0; i < tb.length; i++)
        for(int j=0; j<tb[i].length; j++)
            tb[i][j] = ++licznik;
    
    for(int i=0; i < tb.length; i++)
            System.out.println(Arrays.toString(tb[i]));
    
    System.out.println("\n");
    
    for(int i=0; i < tb.length; i++)
        for(int j=i; j<tb[i].length; j++){
            int temp = tb[i][j]; 
            tb[i][j] = tb[j][i];
            tb[j][i] = temp;
        }
    for(int i=0; i < tb.length; i++)
            System.out.println(Arrays.toString(tb[i]));
  
    //---------------------------------------------
    
    System.out.println("\n");
    int[][] tbl = new int[9][9];
    
    for(int i=0; i < tbl.length; i++)
        for(int j=0; j<tbl[i].length; j++)
            tbl[i][j] = r.nextInt(10);
    
    for(int i=0; i < tbl.length; i++)
        System.out.println(Arrays.toString(tbl[i]));
    
    int suma = 0;
    int eptrzy = 0;
    for(int i=0; i < tbl.length; i++)
        for(int j=0; j<tbl[i].length; j++){
            if(i == j || i+j == tbl[i].length-1)
                suma += tbl[i][j];
            if((tbl[i][j] % 3) == 0 )
                eptrzy++;
        }
    System.out.println("\n");
    System.out.println("Elementów podzielnych przez 3 jest: " + eptrzy);
    System.out.println("Suma przekątnych wynosi: " + suma);
    
    }
    
}
