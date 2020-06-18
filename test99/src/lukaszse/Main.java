package lukaszse;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.FileAlreadyExistsException;

public class Main {

    public static void main(String[] args) {
        // write your code here

        try {
            RandomAccessFile fileIn = new RandomAccessFile("domy.dat", "rw");

            fileIn.seek(0);
            while( fileIn.getFilePointer() < fileIn.length() ) {

                //odczyt danych z pliku
                String nazwaDomu = fileIn.readUTF();
                int iloscKondyg = fileIn.readInt();
                long pozycja1 = fileIn.getFilePointer(); //pozycja przed ceną
                double cenaDomu = fileIn.readDouble();
                String lokalizacja = fileIn.readUTF();
                long pozycja2 = fileIn.getFilePointer();

                //wypisanie na ekran danych z odczytanych z pliku (sprawdzenie poprawnosci odczytu)
                System.out.println("\n");
                System.out.println("Nazwa: " + nazwaDomu);
                System.out.println("Pięter: " + iloscKondyg);
                System.out.println("cena: " + cenaDomu);
                System.out.println("lokalizacja: " + lokalizacja);

                //jeśli dom jest na wsi i jest parterowy -> obniżamy cene i zapisujemy do pliku
                if(lokalizacja.equals("wies") && iloscKondyg == 1){
                    cenaDomu *= 0.9; //obniżenie ceny o 10%
                    System.out.println(nazwaDomu + " znajduje sie na wsi i jest parterowy dlatego redukujemy jego cene o 10% do kwoty: " + cenaDomu);
                    fileIn.seek(pozycja1);
                    fileIn.writeDouble(cenaDomu);
                    fileIn.seek(pozycja2);
                }
            }
            fileIn.close();

        } catch (FileNotFoundException e1) {
            System.out.println("Nie ma takiego pliku");
        } catch (IOException e) {
            System.out.println("Błąd IO");
        }
    }
}