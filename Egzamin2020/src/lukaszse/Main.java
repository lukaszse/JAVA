package lukaszse;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        File fileIn;
        Scanner sc = null;
        FileOutputStream fileOut = null;
        DataOutputStream dout = null;

        try {

            fileIn = new File("plik.txt");
            sc = new Scanner(fileIn);
            fileOut = new FileOutputStream("plikWyjsciowy.txt");
            dout = new DataOutputStream(fileOut);


            while (sc.hasNextLine()) {
                String imie = sc.nextLine();
                String nazwisko = sc.nextLine();
                double pensja = sc.nextDouble(); sc.nextLine();
                int wiek = sc.nextInt(); sc. nextLine();

                double kredyt = ((pensja * 1.5) / 6) * (60 - wiek);
                System.out.println(nazwisko + ": " + kredyt);

                dout.writeUTF(nazwisko);
                dout.writeDouble(kredyt);

            }


        } catch (FileNotFoundException e){
            System.out.println("Nie znaleziono pliku: " + e.getMessage() );
        } catch (IOException e){
            System.out.println("blad IO: " + e.getMessage());
        } finally {
            if(sc != null) sc.close();
            if(dout != null) dout.close();
            if(fileOut != null) fileOut.close();
        }

        System.out.println("\nA teraz odczyt z pliku z danymi binarnymi zapisanymi przed chwileczką");

        try {
            DataInputStream in = new DataInputStream(
                    new FileInputStream("plikWyjsciowy.txt"));
            String naziwsko;
            while(in.available() > 0){
                String nazwisko = in.readUTF();
                double kredyt = in.readDouble();
                System.out.println(nazwisko + ": " + kredyt);
            }
            in.close();

        }catch(FileNotFoundException e1){
            System.out.println("Nie znaleziono pliku: " + e1.getMessage());
        }


    }
}
