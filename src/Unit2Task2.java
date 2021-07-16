public class Unit2Task2 {
    //Одноклеточная амеба каждые 3 часа делится на 2 клетки.
    // Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
    public static void main(String[] args) {
        int hours = 0;
        int amoebaCounter = 1;

        while (hours<24){
            amoebaCounter *=2;
            hours +=3;
        }

        System.out.println(amoebaCounter);
    }
}
