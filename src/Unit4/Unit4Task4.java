package Unit4;

public class Unit4Task4 {
    //Посчитать сумму четных элементов стоящих над побочной диагональю.
    public static void main(String[] args) {
        Matrix m = new Matrix();
        int[][] matrix = m.createMatrix();
        int sum = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = (matrix.length - 2) - i; j >= 0; j--){
                if(matrix[j][i] % 2 == 0){
                    System.out.println(matrix[j][i]);
                    sum += matrix[j][i];
                }
            }
        }
        System.out.println(sum);
    }
}
