import java.util.Arrays;
import java.util.Random;

public class Unit3Task5 {
    //Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
    // выведите массивы на экран в двух отдельных строках.
    // Посчитайте среднее арифметическое элементов каждого массива и сообщите,
    // для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

    public static void main(String[] args) {
        Random random = new Random();

        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < array1.length; i++){
            array1[i] = random.nextInt(15);
            array2[i] = random.nextInt(15);
            sum1 += array1[i];
            sum2 += array2[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        if((sum1/array1.length) > (sum2/array2.length)){
            System.out.println("Arithmetical mean the first array is greater");
        }else if((sum1/array1.length) < (sum2/array2.length)){
            System.out.println("Arithmetical mean the second array is greater");
        }else{
            System.out.println("Arithmetical means are equal");
        }
    }
}
