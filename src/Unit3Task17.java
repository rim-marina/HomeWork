import java.util.Arrays;
import java.util.Random;

public class Unit3Task17 {
    // Проверить, различны ли все элементы массива.
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[12];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
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

        int count = 0;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] == array[i+1]) {
                count++;
            }
        }

        if(count > 0){
            System.out.println("There is " + count + " equals element(s)");
        }else{
            System.out.println("All elements are different");
        }
    }
}