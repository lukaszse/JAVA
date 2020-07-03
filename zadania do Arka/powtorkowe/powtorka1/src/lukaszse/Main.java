package lukaszse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        int ocenaTemp;
        int najmniejsza = 10;
        int najwieksza = 0;
        int suma = 0;
        double srednia;
        boolean graWtoku = true;

        while(graWtoku) {
            System.out.println("\n\nTo jest program do obliczania średniej oceny sędziów (10 sędziów - średnia z 8 po odrzuceniu skrajnych) \n");
            System.out.println("Podaj oceny (od 0 do 10) kolejnych 10 sedziow potwierdzajac enterem: \n");

            for (int i = 1; i <= 10; i++) {

                ocenaTemp = sc.nextInt();
                System.out.println("Podałeś ocenę nr " + i + ": " + ocenaTemp);
                if (ocenaTemp > 10 || ocenaTemp < 0) {
                    System.out.println("Wprowadziłeś złe liczbę. Wpisz ostatnią liczbę ponownie.\n");
                    i--;
                } else {
                    suma += ocenaTemp;
                    if (ocenaTemp < najmniejsza)
                        najmniejsza = ocenaTemp;
                    if (ocenaTemp > najwieksza)
                        najwieksza = ocenaTemp;
                }
            }


            suma = suma - najwieksza - najmniejsza;
            srednia = suma / 8;

            System.out.println("\n----------------------------");
            System.out.println("Najwieksza: " + najwieksza);
            System.out.println("Najmniejsza: " + najmniejsza);
            System.out.println("Suma: " + suma);
            System.out.println("Srednia: " + srednia);
            System.out.println("----------------------------\n");

            System.out.println("Czy chcesz obliczyć oceny raz jeszcze? [1 - tak, 2 - nie]");
            int wybor = sc.nextInt();
            sc.nextLine();

            switch (wybor) {
                case 1:
                    graWtoku = true;
                    break;
                case 2:
                    graWtoku = false;
            }
        }
    }
}
