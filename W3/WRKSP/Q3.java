abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started with a key.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped with a key.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with a kickstart.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped with a kill switch.");
    }
}

// Main class
public class Q3 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        System.out.println("Car Actions:");
        car.startEngine();
        car.stopEngine();

        System.out.println("\nMotorcycle Actions:");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
