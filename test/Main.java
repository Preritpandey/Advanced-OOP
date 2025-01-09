class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Brand: " + getBrand() + ", Speed: " + getSpeed() + " km/h");
    }
}

class Bike extends Vehicle {
    public Bike(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike Brand: " + getBrand() + ", Speed: " + getSpeed() + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 180);
        Vehicle bike = new Bike("Yamaha", 120);

        car.displayInfo();
        bike.displayInfo();
    }
}
