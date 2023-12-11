import DIP.*;
import OCP.Bus;
import OCP.Car;
import OCP.Vehicle;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
//        mainOcp();
        mainDip();

    }

    public static void mainOcp() {
        Vehicle car = new Car(123, "Car");
        System.out.println("car speed - " + car.calculateAllowedSpeed());

        Vehicle bus = new Bus(80, "Bus");
        System.out.println("bus speed - " + bus.calculateAllowedSpeed());
    }

    public static void mainDip() {
        iEngine petrolEngine = new Petrol();
        CarDIP petrolCar = new CarDIP(petrolEngine, "Audi");
        petrolCar.start();

        iEngine dieselEngine = new Diesel();
        CarDIP dieselCar = new CarDIP(dieselEngine, "BMW");
        dieselCar.start();
    }
}