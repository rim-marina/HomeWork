package Unit4;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public int[][] createMatrix(){
        System.out.println("Enter matrix`s size");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        Random random = new Random();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = random.nextInt(50);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }


}
