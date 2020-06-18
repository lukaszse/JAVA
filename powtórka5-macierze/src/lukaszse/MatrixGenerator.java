package lukaszse;

import java.util.Arrays;
import java.util.Random;

public class MatrixGenerator {
    int[][] matrix;

    public MatrixGenerator(int lines, int rows) {
        matrix = new int[lines][rows];

        for(int i=0; i<matrix.length; i++)
            for(int j=0; j<matrix[i].length; j++) {
                this.matrix[i][j] = randomGeneration(0, 6);
            }
    }

    public int randomGeneration(int from, int to){
        Random r = new Random();
        return r.nextInt(to-from+1)+from;
    }

    public int[][] getMatrix() {
        return this.matrix;
    }

    public void showMatrix(){
        try {
            for (int i = 0; i < this.matrix.length; i++)
                System.out.println(Arrays.toString(this.matrix[i]));
        }catch(NullPointerException e){
            System.out.println("Błedne dane w tablicy");
        }

    }

    public static void showMatrix(int[][] matrix) {
        try {
            for (int i = 0; i < matrix.length; i++)
                System.out.println(Arrays.toString(matrix[i]));
        }catch(NullPointerException e){
            System.out.println("Błedne dane w tablicy");
        }
    }
}
