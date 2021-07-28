import java.util.Arrays;
import java.util.Random;

public class Unit3Task14 {
    //Найти наименьший нечетный элемент.
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[12];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if(array[i] % 2 != 0){
                count++;
            }
        }

        int[] oddArray = new int[count];
        int index = 0;

        for (int j : array) {
            if (j % 2 != 0) {
                oddArray[index] = j;
                index++;
            }
        }

        int min = oddArray[0];
        for (int num : oddArray) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(oddArray));
        System.out.println(min);
    }
}