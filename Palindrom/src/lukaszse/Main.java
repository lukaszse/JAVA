package lukaszse;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        do{
//            Palindrom palindrom1 = new Palindrom();
//        }while(true);

        String ala = "kot ali ma ją w nosie";
        String odwroconaAla;
        char[] alaChar = ala.toCharArray();
        char[] odwroconaAlaChar = new char[alaChar.length];

        for(int i=0; i<alaChar.length;i++){
            odwroconaAlaChar[(alaChar.length)-i-1] = alaChar[i];
        }

        System.out.println(Arrays.toString(alaChar));
        System.out.println(Arrays.toString(odwroconaAlaChar));
        odwroconaAla = new String(odwroconaAlaChar);
        System.out.println(odwroconaAla);


        String tekst = "siakiś sobie tekst";
        String odwroconyTekst = "";

        for(int i=0; i<tekst.length(); i++)
            odwroconyTekst += tekst.charAt(tekst.length()-i-1);

        System.out.println(tekst);
        System.out.println(odwroconyTekst);

<<<<<<< HEAD
        tekst = "czy to jest palindrom czy nie?";
        System.out.println("\nPalindromem: \"" + tekst + "\" jest: ");
        System.out.println(Palindrom.isPalindrome(tekst));

        ///testing egzamining
        Integer Integer=999;
        String tekst33 = Integer.toString();
        String tekst2 = Integer.toString(99);

        System.out.println(Integer.toString(99));

        double a = 1.0/-0;
        System.out.println(a);



    }

=======
    }
>>>>>>> 346f045829d277f75ccecfb0da77ec5feb03e510
}
