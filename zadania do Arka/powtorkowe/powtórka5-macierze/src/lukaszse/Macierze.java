package lukaszse;

public class Macierze {

    public static int[][] mnozenie (int[][]matA, int[][]matB){
        int[][] A = matA;
        int[][] B = matB;
        int[][] C = new int[A.length][B[1].length];

        //sprawdzenie czy liczba kolumn macierzy A jest równa liczbie wierszy macierzy B
        try {
            for (int i = 0; i < A.length; i++)
                if (A[i].length == B.length) {
                    for (int j = 0; j < B[i].length; j++) {
                        C[i][j] = 0; //zerowanie macierzy - czy potrzebne? do spr.
                        for (int k = 0; k < A[i].length; k++)
                            C[i][j] += A[i][k] * B[k][i];
                    }
                } else {
                    System.out.println("Wymiar macierzy jest nieprawidłowy");
                    return null;
                }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Wymiar macierzy jest nieprawidłowy");
        } catch (NullPointerException e2){
            System.out.println("Wymiar macierzy jest nieprawidłowy");
        }

        return C;
    }
}
