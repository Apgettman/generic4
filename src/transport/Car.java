package transport;

public class Car extends Transport implements Competing, iCanDrive {

    private TypeOfBody typeOfBody;

    public Car(String brand, String model, double engineCapacity, TypeOfBody typeOfBody) {
        super(brand, model, engineCapacity);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public void startMoving() {
        System.out.println( "Начинаю движение");
    }
    public void stopMoving() {
        System.out.println("Завершаю движение");
    }
    public void pitStop() {
        System.out.println("Пит-Стоп 2 минуты");
    }
    public void bestLapTime() {
        System.out.println("Лучший круг за 5 минут");
    }
    public void maximumSpeed() {
        System.out.println("Максимальная скорость 200 км/ч");
    }
    public void refuel() {
    }
    public void driver(String category) {
        System.out.println("Я управляю: " + getBrand());
        System.out.println("У именя: " + Car.CATEGORY_B);
    }
    public void printType() {
        if (typeOfBody == null) ;
        //System.out.println("Данных по авто недостаточно");
        System.out.println("Тип кузова: " + typeOfBody);
    }
    public boolean service() {
        return Math.random() > 0.7;
    }
}
