import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Unit3Task18 {
    //Подсчитать, сколько раз встречается элемент с заданным значением.8)
    // Найти второй по величине (т.е. следующий по величине за максимальным) элемент в массиве.
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[12];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if(array[i] == n){
                count++;
            }
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

        System.out.println("This number meets " + count + " time(s)");
        System.out.println("Before max value is " + array[1]);
    }
}