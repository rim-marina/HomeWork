public class Unit2Task1 {
    //Начав тренировки, спортсмен в первый день пробежал 10 км.
    // Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
    // Какой суммарный путь пробежит спортсмен за 7 дней?

    public static void main(String[] args) {
        double distance = 10;

        for(int i=0; i<7; i++){
            double difference = distance * 10 / 100;
            distance += difference;
        }

        double roundOff = Math.round(distance* 100.0) / 100.0;
        System.out.println(roundOff);
    }
}
