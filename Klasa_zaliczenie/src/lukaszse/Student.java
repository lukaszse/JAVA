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
            if(ocena < 3) //UWAGA: przyjęto ze nie dodanie wszystkich ocen do tabeli bedzie skutkowac brakiem zaliczenia. W przeciwnym razie trzeba by zastosować warunek (ocena == 2).
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

    //Pozostałe getery

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getGrupa() {
        return grupa;
    }

    //Pozostałe settery (umozliwiajace modyfikacje pól) - nie były wymagane w tresci zadania

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    //Oprocz tego mozna by napisać metodę zmieniającą ilość ocen (nie wymagało jednak tego zadanie)
}
