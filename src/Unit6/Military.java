package Unit6;

public class Military extends AirTransport implements Methods{
    boolean ejectionSystem;
    int rocketNumber;

    String isEjectionSystem(){
        return ejectionSystem ? " " : " not ";
    }

    @Override
    public String description() {
        return "Brand of car " + getBrand() + "\n" +
                "Wing span " + getWingspan() + " m" + "\n"
                + "Max speed" + getMaxSpeed() + "km/h" + "\n"
                + getWeight() + " kg weight" + "\n"
                + "Minimum " + getRwMinForTakeOff() + " m of run way for take off" + "\n"
                + rocketNumber + " rockets" + "\n"
                + "There is " + isEjectionSystem() + "an ejection system" + "\n"
                + getHorsePower() + " horse power and " + powerToKiloWatt(getHorsePower()) + "kilo watt";
    }

    @Override
    public void showInfo() {
        System.out.println(description());
    }

    private String strike(){
        return this.rocketNumber > 0 ? "Ракета пошла…" : "Боеприпасы отсутствуют";
    }

    public void strikeInfo(){
        System.out.println(strike());
    }

    private String ejection(){
        return this.ejectionSystem ? "Катапультирование прошло успешно" : "У вас нет такой системы";
    }

    public void ejectionInfo(){
        System.out.println(ejection());
    }
}
