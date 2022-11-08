package transport;

public abstract class Transport implements Competing{

    private final String brand;
    private final String model;
    private final double engineCapacity;
    public static final String CATEGORY_B = "Категория (B)";
    public static final String CATEGORY_С = "Категория (С)";
    public static final String CATEGORY_D = "Категория (D)";

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
    public boolean service() {
    return false;
    }
    public void pitStop() {
    }
    public void bestLapTime() {
    }
    public void maximumSpeed() {
    }
}
