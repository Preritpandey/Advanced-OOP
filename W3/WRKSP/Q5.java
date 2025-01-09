interface PaymentMethod {
    void processPayment(double amount);
}

class Esewa implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of NPR " + amount + " through eSewa.");
    }
}

class Khalti implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of NPR " + amount + " through Khalti.");
    }
}

// Main class
public class Q5 {
    public static void main(String[] args) {
        PaymentMethod esewa = new Esewa();
        PaymentMethod khalti = new Khalti();

        System.out.println("Using eSewa:");
        esewa.processPayment(1500.0);

        System.out.println("\nUsing Khalti:");
        khalti.processPayment(2500.0);
    }
}
