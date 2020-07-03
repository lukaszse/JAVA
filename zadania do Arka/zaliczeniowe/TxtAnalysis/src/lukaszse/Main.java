package lukaszse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String wyraz;
        String tekst=null;
        String nazwaPliku;
        Scanner sc = new Scanner(System.in);

        mainloop: while(true) {
            System.out.println("\n-----------------------------------------------------------");
            System.out.println("            To jest program do analizy tekstu:");
            System.out.println("-----------------------------------------------------------");
            System.out.println("\nWciśnij:");
            System.out.println("1 - analiza tekstu \n2 - wyjście");
            int wybieracz = sc.nextInt(); sc.nextLine();

                loopLvl1: switch (wybieracz) {
                    case 1:
                        System.out.println("Podaj wyraz który chcesz wyszukać w tekście.");
                        wyraz = sc.nextLine();
                        System.out.println("Podaj nazwe pliku tekstowego *.txt (bez wpisywania rozszerzenia pliku)");
                        tekst = sc.nextLine();

                        TxtAnalysis nowaAnaliza = new TxtAnalysis(tekst + ".txt", 'f');
                        System.out.println("\nOto tekst z pliku:\n" + nowaAnaliza.getText());
                        System.out.println("\nPodane przez ciebie słowo ***" + wyraz + "***1 występuje w tekście: " + nowaAnaliza.countWordInstances(wyraz) + " razy\n\n");

                        loopLvl2: while(true){
                            System.out.println("Wyświetlić histogram? [t/n]");
                            char histo =  sc.nextLine().charAt(0);
                            switch (histo){
                                case 't':
                                    try{
                                        nowaAnaliza.showHistogram();
                                    }catch (NullPointerException e){
                                        System.out.println("Błąd pliku, nie mogę wyświetlić danych");
                                    }
                                    break loopLvl2;
                                case 'n':
                                    break loopLvl2;
                                default:
                            }
                        }

                        break;
                    case 2:
                        System.out.println("Bye");
                        break mainloop;
                }
            }
        }
}
