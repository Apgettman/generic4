package transport;

public class Truck extends Transport implements Competing, iCanDrive{

    private Weight weight;

    public Truck(String brand, String model, double engineCapacity, Weight weight) {
        super(brand, model, engineCapacity);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public void startMoving() {
        System.out.println("Начинаю движение");
    }
    public void stopMoving() {
        System.out.println("Завершаю движение");
    }
    public void pitStop() {
        System.out.println("Пит-Стоп 1 минуту");
    }
    public void bestLapTime() {
        System.out.println("Лучшее время круга 10 минут");
    }
    public void maximumSpeed() {
        System.out.println("Максимальная скорость 150 км/ч");
    }
    public void refuel() {
    }
    public void driver(String category){
        System.out.println("Я управляю: "  + getBrand());
        System.out.println("У именя: " + Truck.CATEGORY_С);
    }
    public void printType() {
        if (weight == null) ;
       // System.out.println("Данных по авто недостаточно");
        String from = weight.getFrom() == null ? "" : "от " + weight.getFrom() + " ";
        String to = weight.getTo() == null ? "" : "до " + weight.getTo();
        System.out.println("Грузоподъемность авто: " + from + to);
    }
}
