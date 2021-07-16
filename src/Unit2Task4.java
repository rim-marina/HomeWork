public class Unit2Task4 {
    //Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.

    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int result = 0;

        for(int i = 0; i<b; i++){
            result += a;
        }

        System.out.println(result);
    }
}
