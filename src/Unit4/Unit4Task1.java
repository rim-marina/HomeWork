package Unit4;

public class Unit4Task1 {
    public static void main(String[] args) {
        // Поcчитать сумму четных элементов стоящих на главной диагонали.
        Matrix m = new Matrix();
        int[][] matrix = m.createMatrix();
        int sum = 0;

        for(int i = 0; i < matrix.length; i++){
            int j = i;
            if(matrix[i][j] % 2 == 0){
                sum += matrix[i][j];
            }
        }

        System.out.println(sum);
    }
}
