package lukaszse;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Egzamin egz = new Egzamin(3,5);

        float[][] temp = egz.oceny;

        for(int i=0; i<temp.length; i++)
            System.out.println(Arrays.toString(temp[i]));
    }
}
