import java.util.Arrays;
import java.util.Random;

public class Unit3Task13 {
    //Найти средне арифметическое элементов массива, превосходящих некоторое число С.
    public static void main(String[] args) {
        Random random = new Random();
        int C = 20;
        int[] array = new int[12];
        int sum = 0;
        int cont = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if(array[i] > C){
                sum += array[i];
                cont++;
            }
        }
        int average = sum / cont;

        System.out.println(Arrays.toString(array));
        System.out.println(average);
    }
}
