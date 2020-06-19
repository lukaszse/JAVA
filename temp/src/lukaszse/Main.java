package lukaszse;

public class Main {

    public static void main(String[] args) {

        StringBuffer tekst = new StringBuffer("Testujemy");
        System.out.println(tekst);
        StringBuffer odwrocony;
        odwrocony = new StringBuffer(tekst);
        odwrocony.reverse();
        System.out.println(tekst);
        System.out.println(odwrocony);

    }
}
