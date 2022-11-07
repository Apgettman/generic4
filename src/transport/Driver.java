package transport;

public class Driver <T extends Transport> {

    private final String fio;
    private final String availabilityOfRights;
    private final double experience;
    public Driver(String fio, String availabilityOfRights, double experience) {
        this.fio = fio;
        this.availabilityOfRights = availabilityOfRights;
        this.experience = experience;
    }
    public String getFio() {
        return fio;
    }
    public String getAvailabilityOfRights() {
        return availabilityOfRights;
    }
    public double getExperience() {
        return experience;
    }
    public void driveB(T car) {
        System.out.println("Я управляю: "+ car.getBrand() + " " + car.getModel());
        System.out.println("У именя: " + Transport.CATEGORY_B + " и я буду учавствовать в заезде!");
    }
    public void driveC(T car) {
        System.out.println("Я управляю: "+ car.getBrand() + " " + car.getModel());
        System.out.println("У именя: " + Transport.CATEGORY_С + " и я буду учавствовать в заезде!");
    }
    public void driveD(T car) {
        System.out.println("Я управляю: " + car.getBrand() + " " + car.getModel());
        System.out.println("У именя: " + Transport.CATEGORY_D+ " и я буду учавствовать в заезде!");
    }
}

