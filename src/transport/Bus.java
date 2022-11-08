package transport;

public class Bus extends Transport implements Competing, iCanDrive {

    private Capacity capacity;

    public Bus(String brand, String model, float engineCapacity, Capacity capacity) {
        super(brand, model, engineCapacity);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public void startMoving() {
        System.out.println("Начинаю движение");
    }

    public void stopMoving() {
        System.out.println("Завершаю движение");
    }

    public void pitStop() {
        System.out.println("Пит-Стоп 3 минуты");
    }

    public void bestLapTime() {
        System.out.println("Лучший круг за 6 минут");
    }

    public void maximumSpeed() {
        System.out.println("Лучшая скорость 180 км/ч");
    }

    public void refuel() {

    }

    public void driver(String category) {
        System.out.println("Я управляю: " + getBrand());
        System.out.println("У именя: " + Bus.CATEGORY_D);
    }

    public void printType() {
        if (capacity == null) ;
        //System.out.println("Данных по авто недостаточно");
        System.out.println("Вместимость автобуса: от " + capacity.getFrom() + " до " + capacity.getTo());
    }
    public boolean service() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не требуется");
        return true;
    }
}


