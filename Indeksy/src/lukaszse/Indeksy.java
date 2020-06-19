package lukaszse;


import java.util.Arrays;

public class Indeksy {

    private float[][] listaOcen;

    public Indeksy(int liczbaStudentow, int liczbaModulow) {
        this.listaOcen = new float[liczbaStudentow][liczbaModulow];
    }

    float obliczSrednia(int student){
        float suma=0;
        for(float ocena : listaOcen[student]){
            if(ocena < 3)
                return 2; //jeśli ocena mniejsza od 3 (czyli fe facto 2, lub 0 oznaczajace brak oceny) funkcja zwroci 2
            suma += ocena;
        }
        return suma/listaOcen[student].length;
    }

    boolean zaliczonyRok(int student){
        return ((obliczSrednia(student) >= 3.0) ? true : false);
    }

    void wpiszModul(int student, int modul, float ocena){
        this.listaOcen[student][modul] = ocena;
    }

    void wypiszDane(int student){
        System.out.println("Student: " + student + " - " + Arrays.toString(listaOcen[student]) + " - rok zaliczony: " + zaliczonyRok(student));

        double pi = 42e7;
        System.out.println("pi: " + pi);

        int i = 2;

        System.out.println("i: "+i);

    }



}
