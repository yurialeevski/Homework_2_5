package Transport;

public class PassengerCar<T extends Driver_Category_B> extends Transport implements Competing {

    private final T driver;
    public PassengerCar(String brand, String model, double engineVolume, T driver) {
        setBrand(defaultBrandOrModel(brand));
        setModel(defaultBrandOrModel(model));
        setEngineVolume(defaultEngineVolume(engineVolume));
        this.driver = driver;
    }

    @Override
    public String toString() {
        return
        "Transport{" + "PassengerCar{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume() +
                ", driver=" + driver +
                "}}";
    }

    @Override
    public void startMovement() {
        System.out.println("Легковой автомобиль начинет двигаться быстро.");
    }

    @Override
    public void stopMovement() {
        System.out.println("Легковой автомобиль останавливается быстро и легко.");
    }
    public static String defaultBrandOrModel(String string) {
        if(string == null || string.isEmpty()) {
            return "Lada";
        }
        return string;
    }
    public static double defaultEngineVolume(double engineVolume) {
        if(engineVolume <= 0.0 || engineVolume >= 3.0 ) {
            return 1.2;
        }
        return engineVolume;
    }

    @Override
    public void pit_stop() {
        System.out.println("Пит-стоп для автомобиля " + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга для автомобиля " + getModel());
    }

    @Override
    public void maximumSpeed() {
        System.out.println("максимальная скорость для автомобиля " + getModel());
    }
}
