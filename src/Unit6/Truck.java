package Unit6;

public class Truck extends GroundTransport implements Methods{
    int liftingCapacity;

    @Override
    public String description() {
        return "Brand of car " + getBrand() + "\n" +
                "Lifting capacity  " + liftingCapacity + "\n"
                + "Max speed" + getMaxSpeed() + "km/h" + "\n"
                + getWeight() + " kg weight" + "\n"
                + "Fuel consumption" + getFuelConsumption() + " l per 100 km" + "\n"
                + getNumberWheel() + " wheels" + "\n"
                + getHorsePower() + " horse power and " + powerToKiloWatt(getHorsePower()) + "kilo watt";
    }

    @Override
    public void showInfo() {
        System.out.println(description());
    }

    private boolean isCapacity(int cargoWeight){
        return liftingCapacity > cargoWeight;
    }

    private String loadingPermission(int cargoWeight){
        return isCapacity(cargoWeight) ? "Грузовик загружен" : "Вам нужен грузовик побольше";
    }

    public void loadingInfo(int cargoWeight){
        System.out.println(loadingPermission(cargoWeight));
    }
}
