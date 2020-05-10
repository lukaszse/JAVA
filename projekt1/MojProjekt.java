package moj.projekt;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MojProjekt {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "Policzymy sobie troche");
        String napis;
        //int a, b, c;
        
        double a, b, c;
        
       napis = JOptionPane.showInputDialog(null, "Wpisz liczbe ");
       a = Double.parseDouble(napis);
       napis = JOptionPane.showInputDialog(null, "Wpisz liczbe calkowtta");
       b = Double.parseDouble(napis);
       c = a + b;
       napis = String.valueOf(c);
       JOptionPane.showMessageDialog(null, "Suma: "   + napis); 
       
       c = a % b;
       JOptionPane.showMessageDialog(null, "reszta: " + c);   
       
       c = a * b;
       JOptionPane.showMessageDialog(null, "iloczyn: " + c);   
       
       
        c = a / b;
       JOptionPane.showMessageDialog(null, "iloraz: " + c);   
       
       
      
      double podstawa, h, pole;
      String napisTemp;
      
      napisTemp = JOptionPane.showInputDialog(null, "Podal dlugosc podstawy trojkata ");
      podstawa = Double.parseDouble(napisTemp);
      
      napisTemp = JOptionPane.showInputDialog(null, "Podal dlugosc wysokosci trojkata ");
      h = Double.parseDouble(napisTemp);
      
      pole =  0.5 * podstawa * h;
      
      JOptionPane.showMessageDialog(null, "Pole trojkata wynosi: " + pole);
      
      
      double r;
      double pi = Math.PI;
      
      napisTemp = JOptionPane.showInputDialog(null, "Podal promień kola ");
      r = Double.parseDouble(napisTemp);
      
      pole =  pi * (r * r);
      double obwod = 2 * pi * r;
      
      JOptionPane.showMessageDialog(null, "Pole kola wynosi " + pole + "      Natomiast obwod :" + obwod );
      
      System.out.println("obwod = " + obwod);

      String pozegnanie = sc.nextLine();
      System.out.println(pozegnanie);
      
        
    }
    
}
  