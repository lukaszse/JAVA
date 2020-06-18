
package rzut.kostka;

import java.awt.BorderLayout;
import java.util.Random;

public class RzutKostka {

    public static void main(String[] args) {

        Random r = new Random();
        int index = 0;
        int number;
        int guess;
        Player player = new Player();
        player.setName("Grzegorz Brzęczyszczykiewicz z Chrząszczyżewoszyc w powiecie Łękołody");


        do {
            index++;
            guess = player.guess();
            System.out.println("Podano liczbę: " + guess);
            number = r.nextInt(6)+1;
            System.out.println("Wylosowano: " + number);

            if(number == guess){
                System.out.println("Gratuluję " + player.getName() + " zgadłeś za " + index + " razem");
                break;
            } else{
                System.out.println("Niestety " + player.getName() + ", nie zgadłeś, spróbój raz jeszcze");
            }
            System.out.println("-----------------------------------------------");
        }while (number != guess); 
    }
}
