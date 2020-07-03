package lukaszse;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        File fileIn = new File("domy.txt");
        File fileOut = new File("domyWysokieMiejskie.txt");
        Scanner sc = new Scanner(fileIn);
        PrintWriter pw = new PrintWriter(fileOut);

        while(sc.hasNextLine()){
            String nazwa = sc.nextLine();
            String lokalizacja = sc.nextLine();
            int pieter = sc.nextInt(); sc.nextLine();
            double cena = sc.nextDouble(); sc.nextLine();

            if(lokalizacja.equals("miasto") && pieter > 5) {
                pw.println(nazwa);
                pw.println(lokalizacja);
                pw.println(pieter);
                pw.println(cena);
            }
        }
        pw.close();
        sc.close();
    }
}
