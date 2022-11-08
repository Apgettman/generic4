package transport;

public class Main {
    public static void main(String[] args) {

        Bus mercedes = new Bus("Mercedes", "9900", 4, Capacity.LARGE);
        Bus volvo = new Bus("Volvo", "5890", 6, Capacity.MEDIUM);
        Bus scania = new Bus("Scania", "7822", 5, Capacity.EXTRA_LARGE);
        Bus tiger = new Bus("Tiger", "9800", 7, Capacity.SMALL);
        mercedes.printInfo();
        mercedes.printType();
        volvo.printInfo();
        volvo.printType();
        scania.printInfo();
        scania.printType();
        tiger.printInfo();
        tiger.printType();

        Car mercedesSl = new Car("Mercedes", "SLS", 6.2, TypeOfBody.COUPE);
        Car audi = new Car("Audi", "RS6", 4.2, TypeOfBody.UNIVERSAL);
        Car ford = new Car("Ford", "GT", 6.0, TypeOfBody.COUPE);
        Car bmw = new Car("BMW", "760М", 6.0, TypeOfBody.SEDAN);
        mercedesSl.printInfo();
        mercedesSl.printType();
        audi.printInfo();
        audi.printType();
        ford.printInfo();
        ford.printType();
        bmw.printInfo();
        bmw.printType();

        Truck man = new Truck("MAN", "2312", 7.5, Weight.N2);
        Truck zil = new Truck("ZIL", "130", 5.5, Weight.N3);
        Truck kamaz = new Truck("KAMAZ", "3301", 6.3, Weight.N1);
        Truck gaz = new Truck("GAZ", "2213", 5.2, Weight.N2);
        man.printInfo();
        man.printType();
        zil.printInfo();
        zil.printType();
        kamaz.printInfo();
        kamaz.printType();
        gaz.printInfo();
        gaz.printType();
        service(mercedesSl, audi, ford, bmw, man, zil, kamaz, gaz, mercedes, volvo, scania, tiger);

        Driver driverB = new Driver("Петров Петр Петрович,", "кат.B,", 11.5, "category");
        System.out.println(driverB.getFio() + " " + driverB.getAvailabilityOfRights() + " Стаж "
                + driverB.getExperience() + " лет! Управляет автомобилем: " + bmw.getBrand() + " " + bmw.getTypeOfBody()
                + " и будет участвовать в заезде!");
        Driver driverC = new Driver("Иванов Иван Иванович,", "кат.С,", 15, "category");
        System.out.println(driverC.getFio() + " " + driverC.getAvailabilityOfRights() + " Стаж "
                + driverC.getExperience() + " лет! Управляет грузовиком: " + man.getBrand() + " и будет участвовать в заезде!");
        Driver driverD = new Driver("Васильев Василий Васильевич,", "кат.Д,", 20, "category");
        System.out.println(driverD.getFio() + " " + driverD.getAvailabilityOfRights() + " Стаж "
                + driverD.getExperience() + " лет! Управляет автобусом: " + mercedes.getBrand() + " и будет участвовать в заезде!");

        Driver<Truck> Sergey = new Driver<>("Смирнов Сергей Сергеевич", "кат.С,", 5, "category");
        Sergey.driveC(man);
        Driver<Car> Andrey = new Driver<>("Андреев Андрей Андреевич", "кат.B,", 10, "category");
        Andrey.driveB(bmw);
        Driver<Bus> Dima = new Driver<>("Дмитриев Дмитрий Васильевич", "кат.Д,", 7, "category");
        Dima.driveD(mercedes);

    }

    private static void service(Transport transport, Transport... transports) {
        for (int i = 0; i < transports.length; i++) {
            serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.service()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel()
                        + " не прошел диагностику!");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());

        }
    }
}