package lukaszse;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("let's start");


        MatrixGenerator macierzA = new MatrixGenerator(2,3);

        MatrixGenerator macierzB = new MatrixGenerator(3,2);

        System.out.println("\nMacierz A =");
        macierzA.showMatrix();
        System.out.println("\nMacierz B =");
        macierzB.showMatrix();

        System.out.println("\nMacierz A * Macierz B =");
        MatrixGenerator.showMatrix(Macierze.mnozenie(macierzA.getMatrix(), macierzB.getMatrix()));
    }
}
