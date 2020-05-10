
package gwiazdki1;


public class Gwiazdki1 {

   
    public static void main(String[] args) {
        
        int rozmiar=5;
        
        for(int i=1; i<=rozmiar; i++){
            
            for(int j=1; j<=rozmiar; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
 System.out.println("\n-------------------------------\n");
        
        for(int i=1; i<=rozmiar; i++){
            
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }

        System.out.print("\nOdwrotnie\n\n");

        
      for(int i=1; i<=rozmiar; i++){
            
            for(int j=1; j<=rozmiar-i; j++){
                System.out.print(" ");
            }
            
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        System.out.println(); 
        
        
        System.out.println();
        System.out.print("Piramidka");
        System.out.println();
        System.out.println();
        
      for(int i=1; i<=5; i++){
            
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        System.out.println();  
        
        
        System.out.println();
        System.out.print("Piramidka");
        System.out.println();
        System.out.println();
        
      for(int i=1; i<=5; i++){
            
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        System.out.println(); 
        
        
        
        for(int i=0; i<rozmiar+1; i++){
            
            if((rozmiar+1)/2 > i){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            
            for(int j=0; j<rozmiar-(2*i); j++){
                System.out.print(" ");
            }
            System.out.print("*");
           
            
            System.out.println();    
            } else if((rozmiar+1)/2 > i){
            System.out.print("*");
            } else {
                for(int j=0; j<i; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            
        }
        System.out.println();  
        
    }
}
