package lukaszse;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String tekst = "ala tolek ala ala";

        int licznik = 0;
        int i=0;
        do {
            //System.out.println(i);
            if(tekst.indexOf("ala",i) != -1) {
                licznik++;
            }
            i = tekst.indexOf("ala",i) + 1;
        }while(tekst.indexOf("ala", i) != -1);

        System.out.println("Licznik: " + licznik);

    }
}
