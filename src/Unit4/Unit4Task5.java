package Unit4;

public class Unit4Task5 {
    //Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
    public static void main(String[] args) {
        Matrix m = new Matrix();
        int[][] matrix = m.createMatrix();
        int[][] newMatrix = matrix;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                newMatrix[i][j] = matrix[j][i];
                newMatrix[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
