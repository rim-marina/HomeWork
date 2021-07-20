public class Unit4Task3 {
    //Проверить произведение элементов какой диагонали больше.
    public static void main(String[] args) {
        Matrix m = new Matrix();
        int[][] matrix = m.createMatrix();
        int multi1 = 1;
        int multi2 = 1;

        for(int i = 0; i <matrix.length; i++){
            multi1 *= matrix[i][i];
        }
        System.out.println(multi1);

        for(int i = matrix.length - 1; i >= 0 ; i--){
            multi2 *= matrix[i][(matrix.length - 1) - i];
        }
        System.out.println(multi2);

        if(multi1 > multi2){
            System.out.println("The first diagonal`s multiplication is greater");
        }else if(multi2 > multi1){
            System.out.println("The second diagonal`s multiplication is greater");
        }else {
            System.out.println("Multiplications are equal");
        }
    }
}
