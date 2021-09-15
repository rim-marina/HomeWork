package Unit6;

public class Civil extends AirTransport implements Methods{
    int passengerNumber;
    boolean businessClass;

    String isBusinessClass(){
        return businessClass ? " " : " not ";
    }

    @Override
    public String description() {
        return "Brand of car " + getBrand() + "\n" +
                "Wing span " + getWingspan() + " m" + "\n"
                + "Max speed" + getMaxSpeed() + "km/h" + "\n"
                + getWeight() + " kg weight" + "\n"
                + "Minimum " + getRwMinForTakeOff() + " m of run way for take off" + "\n"
                + passengerNumber + " passengers" + "\n"
                + "There is " + isBusinessClass() + "a business class" + "\n"
                + getHorsePower() + " horse power and " + powerToKiloWatt(getHorsePower()) + "kilo watt";
    }

    @Override
    public void showInfo() {
        System.out.println(description());
    }

    private boolean isCapacity(int passengerOnBoard){
        return passengerNumber > passengerOnBoard;
    }

    private String loadingPermission(int passengerOnBoard){
        return isCapacity(passengerOnBoard) ? "Самолет загружен" : "Вам нужен самолет побольше";
    }

    public void loadingInfo(int passengerOnBoard){
        System.out.println(loadingPermission(passengerOnBoard));
    }
}
