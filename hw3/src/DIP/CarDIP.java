package DIP;

public class CarDIP {
    private iEngine engine;
    private String car;

    public CarDIP(iEngine engine, String car) {
        this.engine = engine;
        this.car = car;
    }

    public void start() {
        System.out.println(car + " готова начать движение. В баке есть " + engine.getType());
    }
}
