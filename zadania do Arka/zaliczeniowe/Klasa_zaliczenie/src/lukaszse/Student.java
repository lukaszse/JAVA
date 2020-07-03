package lukaszse;

import java.sql.SQLOutput;

public class Student {
    private String imie, nazwisko, grupa;
    private double[] oceny;

    public Student() {
        this.imie = "Jan";
        this.nazwisko = "Kowalski";
        this.grupa = "1";
        this.oceny = new double[10];
    }

    public Student(String imie, String nazwisko, String grupa, int iloscOcen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.grupa = grupa;
        this.oceny = new double[iloscOcen];
    }

    public int wpiszOcene(double ocena){

        for(int i=0; i<this.oceny.length; i++){
            if(this.oceny[i] == 0){
                this.oceny[i] = ocena;
                return i;
            }
        }
        return -1;
    }

    public double sredniaOcen(){
        double suma =0 , iloscNiepustych = 0;
        for( double ocena : this.oceny){
            if(ocena!=0) {
                suma += ocena;
                iloscNiepustych++;
            }
        }
        return suma / iloscNiepustych;
    }

    public boolean sesjaZaliczona(){
        for(double ocena : this.oceny){
            if(ocena < 3)
                return false;
        }
        return true;
    }

    public boolean stypendium(){
        if(sesjaZaliczona() && sredniaOcen() > 4.0)
            return true;
        else
            return false;
    }

    //poniższe metody stworzono na potrzeby testów działania klasy
    public double[] getOceny() {
        return oceny;
    }

    public void wypiszOceny(){
        System.out.println("\nOceny studenta:");
        System.out.println(imie + " " + nazwisko + " grupa: " + grupa);
        for(int i=0; i<this.oceny.length; i++)
            System.out.println("Ocena nr " + (i+1) + ": "+ this.oceny[i]);
    }
}
