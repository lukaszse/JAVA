package lukaszse;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {

        String pesel = emeryt("PESEL");
        System.out.println(pesel);

        String[] araj = {"antek", "felek", "kuternoga", "łoooolaboga"};
        String[] araj2 = araj;
        System.out.println(Arrays.toString(araj));
        System.out.println(Arrays.toString(araj2));

    }

    public static String emeryt (String nazwaPliku){

        File fo, fz;
        Scanner sc;
        PrintWriter pw;
        String tempImie;
        String tempNazwisko;
        String tempPlecStr;
        char tempPlec;
        long PESEL;
        int lataDoEmeryt;
        Random rand = new Random();
        boolean najmniejExequo = false;
        int najmniejDoEmer = 1000;
        String szczesliwiec = "error";
        String[] osoby = new String[1];

        try{
            fo = new File(nazwaPliku + ".txt");
            sc = new Scanner(fo);
            fz = new File(nazwaPliku + ".DATA");
            pw = new PrintWriter(fz);

            int i = 0;


            while(sc.hasNextLine()){
                tempImie        = sc.nextLine();
//                System.out.println(tempImie);
                tempNazwisko    = sc.nextLine();
//                System.out.println(tempNazwisko);
                tempPlecStr     = sc.nextLine();
//                System.out.println(tempPlecStr);
                tempPlec        = tempPlecStr.charAt(0);
//                System.out.println(tempPlec);
                PESEL           = sc.nextLong(); sc.nextLine();
//                System.out.println(PESEL);
                lataDoEmeryt    = sc.nextInt(); sc.nextLine();
//                System.out.println(lataDoEmeryt);

                pw.println(PESEL);
                if(i>0) {
                    String[] temp = osoby;
                    osoby = new String[i + 1];

                    for (int j = 0; j < i; j++)
                        osoby[j] = temp[j];
                }

                osoby[i] = tempImie + " " + tempNazwisko;

                if(tempPlec == 'm') {
                    lataDoEmeryt = lataDoEmeryt - 2;
                    pw.println(lataDoEmeryt);
                }
                else if(tempPlec == 'k') {
                    lataDoEmeryt = lataDoEmeryt - 7;
                    pw.println(lataDoEmeryt);
                }
                else
                    System.out.println("Blad w pliku - nima takij płci");

                if(najmniejDoEmer > lataDoEmeryt){
                    najmniejDoEmer = lataDoEmeryt;
                    szczesliwiec = tempImie + " " + tempNazwisko;
                    najmniejExequo = false;
                } else if (najmniejDoEmer ==  lataDoEmeryt)
                    najmniejExequo = true;

                i++;
            }
            pw.close();
            sc.close();

            if(!najmniejExequo)
                return szczesliwiec;
            else{
                System.out.println("randomizujemy");
                System.out.println(Arrays.toString(osoby));
                return osoby[rand.nextInt(i)];
            }



        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("Something went wrong - who knows?");
        }

        return "error";
    }
}
