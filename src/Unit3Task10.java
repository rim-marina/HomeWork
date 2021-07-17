import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Unit3Task10 {
    //Пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n.
    // Если пользователь ввёл не подходящее число, то программа должна выдать соответствующее сообщение.
    // Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
    // Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number more then 3: ");
        int n = scanner.nextInt();

        while(n <= 3){
            System.out.println("Incorrect. Try again");
            n = scanner.nextInt();
        }

        Random random = new Random();
        int[] array = new int[n];
        int counterEvenNum = 0;

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(n);
            if(array[i] % 2 == 0){
                counterEvenNum++;
            }
        }
        System.out.println(Arrays.toString(array));

        int[] evenArray = new int[counterEvenNum];
        int index = 0;

        for (int j : array) {
            if (j % 2 == 0) {
                evenArray[index] = j;
                index++;
            }
        }
        System.out.println(Arrays.toString(evenArray));
    }
}
