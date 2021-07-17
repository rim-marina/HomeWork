import java.util.Arrays;
import java.util.Collections;

public class Unit3Task2 {
    //Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
    // а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).

    public static void main(String[] args) {
        int size = 0;

        for(int i = 0; i <= 99; i++){
            if(i%2!=0){
                size++;
            }
        }

        int[] array = new int[size];

        for(int i = 0; i < array.length; i++){
            array[i] = i*2+1;
        }
        System.out.println(Arrays.toString(array));

        for(int i = (array.length - 1); i > 0; i--){
            for(int j = 0; j < i; j++){
                if(array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
