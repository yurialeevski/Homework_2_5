package Transport;

public class PassengerCar<T extends Driver_Category_B> extends Transport implements Competing {

    private final T driver;
    private final PassengerCarBodyType bodyType;
    private final Type type;
    public PassengerCar(String brand, String model, double engineVolume, T driver, PassengerCarBodyType bodyType, Type type) {
        setBrand(defaultBrandOrModel(brand));
        setModel(defaultBrandOrModel(model));
        setEngineVolume(defaultEngineVolume(engineVolume));
        this.driver = driver;
        this.bodyType = bodyType;
        this.type = type;
    }

    @Override
    public String toString() {
        return
        "Transport{" + "PassengerCar{" +
                "type='" + type + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume() +
                ", bodyType=" + bodyType +
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
    @Override
    public String getType() {
        return type.getTransportType();
    }

    @Override
    public void printType() {
        if(type != null) {
            System.out.println(getType());
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }
}
