package lukaszse;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
	// write your code here
//        String[] test = new String[6];
//        System.out.println(Arrays.toString(test));

        StosString stos = new StosString(4);

        stos.naStos("Kasia");
        stos.naStos("basia");
        stos.naStos("ola");

        stos.piszStos();

        stos.naStos("Ania");

        stos.piszStos();

        System.out.println(stos.zeStosu());
        stos.piszStos();
        System.out.println(stos.zeStosu());
        stos.piszStos();
        System.out.println(stos.zeStosu());
        stos.piszStos();
        System.out.println(stos.zeStosu());
        stos.piszStos();
        //System.out.println(stos.zeStosu());

    }
}
