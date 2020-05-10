package lukaszse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
        plik = "./" + plik + ".txt";
        System.out.println("Otwieramy plik o nazwie: " + plik );

        try{
            f = new File(plik);
            sc = new Scanner(f);
            String tempNazwa, tempAdres;
            int tempLiczKon;
            Double tempCena;

            do{
                tempNazwa = sc.nextLine();
                System.out.println("Analizuje: " + tempNazwa);
                tempAdres = sc.nextLine();
                tempLiczKon = sc.nextInt(); sc.nextLine();
                tempCena = sc.nextDouble(); sc.nextLine();
            } while (!tempNazwa.equals(nazwaDomu));
            System.out.println("Znaleziono dom o nazwie: " + tempNazwa );

            return tempCena;

        } catch (FileNotFoundException e){
            System.out.println("\nBrak odpowiedniego pliku");
        } catch (IOException e) {
            System.out.println("Nieokreslony blad We/Wy");
        }

        return 0;
    }
}
