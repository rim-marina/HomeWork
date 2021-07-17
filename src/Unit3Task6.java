import java.util.Arrays;
import java.util.Random;

public class Unit3Task6 {
    //Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его на экран в строку.
    //Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.

    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));

        int[] arrayCheck = new int[array.length];

        System.arraycopy(array, 0, arrayCheck, 0, arrayCheck.length);

        for(int i = (arrayCheck.length-1); i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arrayCheck[j] < arrayCheck[j+1]){
                    int temp = arrayCheck[j];
                    arrayCheck[j] = arrayCheck[j+1];
                    arrayCheck[j+1] = temp;
                }
            }
        }

        boolean isIncreasing = Arrays.equals(array, arrayCheck);

        if(isIncreasing){
            System.out.println("This array is increasing");
        }
    }

}
