package transport;

public abstract class Transport implements Competing {

    private final String brand;
    private final String model;
    private final double engineCapacity;
    public static final String CATEGORY_B = "Категория (B)";
    public static final String CATEGORY_С = "Категория (С)";
    public static final String CATEGORY_D = "Категория (D)";
    private String drivers = "Федор и";
    private String mechanics = "Юра и Гарик";
    private String sponsors = "Газпром";


    public Transport(String brand, String model, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        if (model == null || model.isEmpty() || model.isBlank())
            System.out.println("Неверное значение");
        if (brand == null || brand.isEmpty() || brand.isBlank())
            System.out.println("Неверное значение");
        if (engineCapacity <= 0)
            System.out.println("Неверное значение");
    }

    public void addDriver(Driver drivers) {
        this.drivers = String.valueOf(drivers);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", drivers=" + drivers +
                ", mechanics=" + mechanics +
                ", sponsors=" + sponsors +
                '}';
    }

    public String getDrivers() {
        return drivers;
    }

    public String getMechanics() {
        System.out.println("Лукойл");
        return mechanics;
    }

    public String getSponsors() {
        System.out.println("Паша");
        return sponsors;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    protected void printInfo() {
        System.out.println("Марка: " + getBrand() + ", Модель: " + getModel() + ", Объем: " + getEngineCapacity());
    }

    public void printType() {
    }

    public abstract boolean service();

    public abstract void repair();

    public void pitStop() {
    }

    public void bestLapTime() {
    }

    public void maximumSpeed() {
    }
}
