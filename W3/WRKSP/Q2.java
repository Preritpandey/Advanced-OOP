class Car {
    private String model;
    private double price;
    private double fuelLevel; // Read-only field

    public Car(String model, double price, double fuelLevel) {
        this.model = model;
        this.price = price;
        this.fuelLevel = fuelLevel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void displayCarDetails() {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Fuel Level: " + fuelLevel);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Car car = new Car("Tesla Model S", 79999.99, 100.0);

        System.out.println("Initial Car Details:");
        car.displayCarDetails();

        car.setModel("Tesla Model X");
        car.setPrice(89999.99);

        System.out.println("\nUpdated Car Details:");
        car.displayCarDetails();

        System.out.println("\nFuel Level remains read-only: " + car.getFuelLevel());
    }
}
