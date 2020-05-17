package lukaszse;

public class Egzamin {

    //table of students - 1 column: ID number, 2-n column: note
    public float[][] oceny;

    public Egzamin(int liczbStud, int liczbZad) {
        this.oceny = new float[liczbStud][liczbZad];
    }

    public float obliczSrOcen(int student){
        float srednia;
        float suma = 0;
        int j;
        int LepszaNiz2 = 0;

        for(j=1; j<this.oceny[student].length; j++){
            suma += this.oceny[student][j];

            if(this.oceny[student][j] > 2)
                LepszaNiz2++;
        }

        srednia = suma / j;

        if(LepszaNiz2 > (j / 2))
            return srednia;
        else
            return 2;
    }

    public boolean egzZalicz (int student){

        if(obliczSrOcen(student) >= 3)
            return true;
        else
            return false;
    }

    public void wpiszOcene(int student, int zadanie, float ocena){
        this.oceny[student][zadanie] = ocena;
    }

    public void piszDane(){
        System.out.println("  do dopisanio ");
    }
}
