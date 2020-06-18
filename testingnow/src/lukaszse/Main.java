package lukaszse;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*
        int a = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbę a: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbe b: "));

        int c = a + b;

        JOptionPane.showMessageDialog(null, "c = " + c);
*/


        ArrayList<Integer> lista = new ArrayList<>();

        for (int i=0; i<10; i++){
            lista.add(Integer.valueOf(i));
        }

        for(Integer liczba : lista){
            System.out.println(liczba.intValue());
        }

        float zmienna = 1.0f;

        System.out.println(zmienna);
        System.out.println(Float.floatToIntBits(zmienna));
        System.out.println((Integer.toBinaryString(Float.floatToIntBits(zmienna))));

        String łańcuch,
        zera = "0000000000000000000000000000000000000000000000000000000000000000";
        int dł;

        float[] liczbyFloat = { Float.NEGATIVE_INFINITY, -Float.MAX_VALUE, -1F, -Float.MIN_VALUE, -0.0F,
                +0.0F, Float.MIN_VALUE, 1F, Float.MAX_VALUE, Float.POSITIVE_INFINITY, Float.NaN };

        System.out.println("\nLiczby \"float\":");
        for ( float liczba: liczbyFloat )
        { łańcuch = Integer.toBinaryString( Float.floatToIntBits( liczba ));
            if(( dł = łańcuch.length()) < 32 ) łańcuch = zera.substring(0, 31 + 1 - dł ) + łańcuch;
            StringBuffer temp = new StringBuffer(łańcuch);
            temp.insert(1, '\'');
            temp.insert(9,'\'');
            łańcuch = temp.toString();
            System.out.format( "%+103.61f: %s\n", liczba, łańcuch );
        }
    }
}
