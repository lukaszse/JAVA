package lukaszse;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku .txt który chcesz otworzyć, bez rozszerzenia:");
	    String nazwaPliku = sc.nextLine();

        System.out.println("Podaj nazwe domu ktorego cene chcesz poznac:");
        String nazwaDomu = sc.nextLine();

        System.out.println("Cena domu o nazwie " + nazwaDomu + " wynosi: " + cenaDomu(nazwaPliku, nazwaDomu));

    }

    public static double cenaDomu(String plik, String nazwaDomu){
        File f;
        Scanner sc;
        System.out.println("Otwieramy plik o nazwie: " + plik +".txt" );
        FileOutputStream fos;
        DataOutputStream dos;

        try{
            f = new File(plik  + ".txt");
            sc = new Scanner(f);
            fos = new FileOutputStream(plik + ".wyn");
            dos = new DataOutputStream(fos);

            String tempNazwa = "";
            String tempAdres = "";
            int tempLiczKon;
            double tempCena;
            double cena = -1;


            while(sc.hasNextLine()) {
                tempNazwa = sc.nextLine();
                System.out.println("Analizuje: " + tempNazwa);
                tempAdres = sc.nextLine();
                tempLiczKon = sc.nextInt();
                sc.nextLine();
                tempCena = sc.nextDouble();
                sc.nextLine();

                if (tempCena > 500) {
                    // Przepisanie danych do pliku
                    dos.writeUTF(tempNazwa);
                    dos.writeUTF(tempAdres);
                    dos.writeInt(tempLiczKon);
                    dos.writeDouble(tempLiczKon);
                }

                if (tempNazwa.equals(nazwaDomu)) {
                    cena = tempCena;
                }
            }

            sc.close();
            dos.close();

            return cena;


        } catch (FileNotFoundException e){
            System.out.println("\nBrak odpowiedniego pliku");
        } catch (IOException e) {
            System.out.println("Nieokreslony blad We/Wy");
        }

        return 0;
    }
}
