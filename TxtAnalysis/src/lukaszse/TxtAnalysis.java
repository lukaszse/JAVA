package lukaszse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TxtAnalysis {
    private String text;

    //konstruktor klasy TxtAnalysis przyjmuje 2 paramery.
    // Pierwszy z nich to tekst lub nazwa pliku z którego odczytywany jest tekst.
    // Drugi parametr służy do określenia trybu odczyty (t - ze zmiennej string, f - z pliku tekstowego)
    public TxtAnalysis(String text, char mode) {
        if(mode == 't')
            this.text = text.toLowerCase();
        else if (mode == 'f')
            this.text = loadFile(text);
        else{
            this.text = null;
        }
    }

    public int[] txtHistogram(){
        int[] histogram = new int[26];
            for(int i=0; i<this.text.length(); i++){
                if(this.text.toLowerCase().charAt(i) - 'a' >= 0 && this.text.toLowerCase().charAt(i) - 'a' <= 26)
                    histogram[(this.text.toLowerCase().charAt(i))-'a']++;
            }
        return histogram;
    }

    public void showHistogram(){
        System.out.println(             "                 H I S T O G R A M");
        System.out.println(             "----------------------------------------------------");
        for(int i=0; i<26; i++) {
            char znak = (char) (i + 'a');
            System.out.print(znak + ": " + this.txtHistogram()[i] + "       ");
            if((i+1)%5 == 0)
                System.out.println("\n");
        }
        System.out.println("\n");
    }

    public static String loadFile(String nazwaPliku){
            String tekst = "";
        try {
            File f = new File(nazwaPliku);
            Scanner sc = new Scanner(f);

            while(sc.hasNextLine())
                tekst +=  sc.nextLine() + "\n";

            sc.close();

        } catch (FileNotFoundException e){
            System.out.println("Nie znaleziono pliku o nazwie: " + nazwaPliku);
            return null;
        }
        return tekst;
    }

    public void showText(){
        System.out.println(this.text);
    }

    public String getText() {
        return this.text;
    }

    //Uwaga, podana metoda uwzględnia wielkość znaków. Aby zignorować wielkość znaków należało by dodać do metody //toLowerCase()
    public int countWordInstances(String word){
        int wordInstancesCounter = 0;
        int i = 0;
        do{
            if(this.text.indexOf(word, i) != -1) //if(this.text.toLowerCase().indexOf(word.toLowerCase(), i) != -1)
                wordInstancesCounter++;
            i = this.text.indexOf(word, i) + 1;
        } while (this.text.indexOf(word, i) != -1);

        return wordInstancesCounter;
    }
}
