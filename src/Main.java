import Transport.*;

public class Main {
    public static void main(String[] args) {
        Driver_Category_B petrov = new Driver_Category_B("Петров", true, 10);
        System.out.println(petrov);
        PassengerCar<Driver_Category_B> passengerCar = new PassengerCar<Driver_Category_B>("", "", 31.6, petrov);
        PassengerCar<Driver_Category_B> qashkai = new PassengerCar<Driver_Category_B>("Nissan", "Qashkai", 2.0, petrov);
        PassengerCar<Driver_Category_B> bmw = new PassengerCar<Driver_Category_B>("BMW", "X1", 2.0, petrov);
        PassengerCar<Driver_Category_B> audi = new PassengerCar<Driver_Category_B>("Audi", "A3", 1.8, petrov);
        System.out.println(passengerCar + "\n" + qashkai + "\n" + bmw + "\n" + audi);
        passengerCar.startMovement();
        passengerCar.stopMovement();
        qashkai.maximumSpeed();
        bmw.bestLapTime();
        audi.pit_stop();
        printInformation(petrov, bmw);
        petrov.startDriving();
        petrov.stopDriving();
        petrov.fillFuel();
        System.out.println();

        Driver_Category_C ivanov = new Driver_Category_C("Иванов", true, 9);
        System.out.println(ivanov);
        Truck<Driver_Category_C> truck = new Truck<Driver_Category_C>("", "", 10, ivanov);
        Truck<Driver_Category_C> volvo = new Truck<Driver_Category_C>("Volvo", "FL", 2.4, ivanov);
        Truck<Driver_Category_C> scania = new Truck<Driver_Category_C>("Scania", "P440", 3.0, ivanov);
        Truck<Driver_Category_C> renault = new Truck<Driver_Category_C>("Renault", "Magnum", 12.0, ivanov);
        System.out.println(truck + "\n" + volvo + "\n" + scania + "\n" + renault);
        truck.startMovement();
        truck.stopMovement();
        volvo.pit_stop();
        scania.bestLapTime();
        renault.maximumSpeed();
        printInformation(ivanov, renault);
        ivanov.startDriving();
        ivanov.stopDriving();
        ivanov.fillFuel();
        System.out.println();

        Driver_Category_D sidorov = new Driver_Category_D("Сидоров", true, 20);
        System.out.println(sidorov);
        Bus<Driver_Category_D> bus = new Bus<Driver_Category_D>("", "", 0, sidorov);
        Bus<Driver_Category_D> volvoBus = new Bus<Driver_Category_D>("Volvo", "B12", 12.1, sidorov);
        Bus<Driver_Category_D> maz = new Bus<Driver_Category_D>("MAZ", "203", 12.0, sidorov);
        Bus<Driver_Category_D> mersedesBus = new Bus<Driver_Category_D>("MB", "Tourismo", 12.0, sidorov);
        System.out.println(bus + "\n" + volvoBus + "\n" + maz + "\n" + mersedesBus);
        bus.startMovement();
        bus.stopMovement();
        volvoBus.pit_stop();
        maz.bestLapTime();
        mersedesBus.maximumSpeed();
        printInformation(sidorov, volvoBus);
        sidorov.startDriving();
        sidorov.stopDriving();
        sidorov.fillFuel();
    }
    public static void printInformation(Driver driver, Transport transport) {
        System.out.println("Водитель " + driver.getFullName() +
                            " управляет автомобилем " + transport.getModel() +
                            " и будет участвовать в заезде.");
    }
}