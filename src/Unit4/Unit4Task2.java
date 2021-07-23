package Unit4;

public class Unit4Task2 {
    //Вывести нечетные элементы находящиеся под главной диагональю.
    public static void main(String[] args) {
        Matrix m = new Matrix();
        int[][] matrix = m.createMatrix();

        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j >= 0; j--){
                if(matrix[i][j] % 2 != 0){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
