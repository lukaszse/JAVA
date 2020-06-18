package lukaszse;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        RandomAccessFile file = new RandomAccessFile("domy.dat", "rw");
        Scanner sc = new Scanner(System.in);
        System.out.println("\nd2emTworzenie domów");

        file.seek(0);

        main: while(true){
            System.out.println("1 - dodaj dom \n2 - Zakończ");
            int wybor = sc.nextInt();
            switch (wybor){
                case 1:
                    System.out.println("nazwa domu: ");
                    file.writeUTF(sc.next());
                    System.out.println("ilosc pieter: ");
                    file.writeInt(sc.nextInt());
                    System.out.println("Cena: ");
                    file.writeDouble(sc.nextDouble());
                    System.out.println("lokalizacja: ");
                    file.writeUTF(sc.next());
                    break;
                case 2:
                    break main;
                default:
                    break;
            }
            file.close();
        }
    }
}
