import java.util.Arrays;
import java.util.Random;

public class Unit3Task19 {
    //Найти наименьший элемент среди элементов с четными индексами массива
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[12];
        int[] evenIndexArray = new int[array.length / 2];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if(i % 2 == 0){
                evenIndexArray[index] = array[i];
                index++;
            }
        }

        int min = evenIndexArray[0];

        for(int i = 0; i < evenIndexArray.length; i++){
            if(min >= evenIndexArray[i]){
                min = evenIndexArray[i];
            }
        }
        System.out.println(min);
    }
}