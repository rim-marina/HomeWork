package Unit6;

public class Car extends GroundTransport implements Methods {
    String bodyType;
    int numberOfPassengers;

    @Override
    public String description() {
        return "Brand of car " + getBrand() + "\n" +
                "Body type " + bodyType + "\n"
                + "Max speed" + getMaxSpeed() + "km/h" + "\n"
                + getWeight() + " kg weight" + "\n"
                + "Fuel consumption" + getFuelConsumption() + " l per 100 km" + "\n"
                + getNumberWheel() + " wheels" + "\n"
                + numberOfPassengers + " passengers" + "\n"
                + getHorsePower() + " horse power and " + powerToKiloWatt(getHorsePower()) + "kilo watt";
    }

    @Override
    public void showInfo() {
        System.out.println(description());
    }

    private double distance(int minutes){
        return minutes/60*getMaxSpeed();
    }

    private double fuel(double distance){
        return distance / 100 * getFuelConsumption();
    }

    public void carInfo(int minutes){
        double distance = distance(minutes);
        System.out.println("За время " + minutes + ", автомобиль " + getBrand()
                + " двигаясь с максимальной скоростью " + getMaxSpeed()
                + "км/ч проедет " + distance + "км  и израсходует " + fuel(distance) + " литров топлива.");
    }


}
