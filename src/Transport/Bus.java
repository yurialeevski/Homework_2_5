package Transport;

public class Bus<T extends Driver_Category_D> extends Transport implements Competing {
    private T driver;
    public Bus(String brand, String model, double engineVolume, T driver) {
        setBrand(defaultBrandOrModel(brand));
        setModel(defaultBrandOrModel(model));
        setEngineVolume(defaultEngineVolume(engineVolume));
        this.driver = driver;
    }
    @Override
    public String toString() {
        return
                "Transport{" + "Bus{" +
                        "brand='" + getBrand() + '\'' +
                        ", model='" + getModel() + '\'' +
                        ", engineVolume=" + getEngineVolume() +
                        ", driver=" + driver +
                        "}}";
    }
    @Override
    public void startMovement() {
        System.out.println("Автобус начинает движение плавно.");
    }
    @Override
    public void stopMovement() {
        System.out.println("Автобус останавливается плавно.");
    }
    public static String defaultBrandOrModel(String string) {
        if(string == null || string.isEmpty()) {
            return "LIAZ";
        }
        return string;
    }
    public static double defaultEngineVolume(double engineVolume) {
        if(engineVolume <= 0.0 || engineVolume > 14.0 ) {
            return 4.0;
        }
        return engineVolume;
    }
    @Override
    public void pit_stop() {
        System.out.println("Пит-стоп для автобуса " + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга для автобуса " + getModel());
    }

    @Override
    public void maximumSpeed() {
        System.out.println("максимальная скорость для автобуса " + getModel());
    }
}
