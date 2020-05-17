package lukaszse;

import java.util.Arrays;
import java.util.Random;


public class LosowanieLiczb {

    int iloscLiczb;
    int[] tablicaLiczb = new int[iloscLiczb];
    Random r = new Random();
    int dolnaGranica;
    int górnaGranica;


    //Konstruktor
    public LosowanieLiczb(int iloscLiczb, int dolnaGranica, int gornaGranica) {
        this.iloscLiczb = iloscLiczb;
        this.dolnaGranica = dolnaGranica;
        this.górnaGranica = gornaGranica;
        tablicaLiczb = losujUnikatowe(iloscLiczb, dolnaGranica, gornaGranica);
        Arrays.sort(tablicaLiczb);
    }


    // Main getter
    public int[] getTablicaLiczb() {
        return tablicaLiczb;
    }


    //Minor random function
    public int losowanie(int dolnaGranica, int górnaGranica) {
        Random rand = new Random();
        return rand.nextInt(górnaGranica - dolnaGranica + 1) + dolnaGranica;
    }


    //main draw
    public int[] losujUnikatowe(int iloscLiczb, int dolnaGranica, int gornaGranica) {

        int[] unikatowe = new int[iloscLiczb];

        for (int i = 0; i < iloscLiczb; i++) {
            boolean unique = true;
            int wylosowana;
            do {
                unique = true;
                wylosowana = losowanie(dolnaGranica, gornaGranica);
                //System.out.println(wylosowana);
                //System.out.println(Arrays.toString(unikatowe));

                for (int j = 0; j < iloscLiczb; j++) {
                    //System.out.println(wylosowana + " = " + unikatowe[j]);
                    if (wylosowana == unikatowe[j]) {
                        unique = false;
                    }
                }


            } while(!unique);
            unikatowe[i] = wylosowana;
        }
        return unikatowe;
    }
}