class Calculator {

 
    public int add(int a, int b) {
        return a + b;
    }

    
    public int add(int a, int b, int c) {
        return a + b + c;
    }

   
    public double add(double a, double b) {
        return a + b;
    }

    
    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void Qno7ws2(String[] args) {
        Calculator calculator = new Calculator();

        
        System.out.println("Sum of two integers (5 + 8): " + calculator.add(5, 8));

        
        System.out.println("Sum of three integers (10 + 15 + 20): " + calculator.add(10, 15, 20));

    
        System.out.println("Sum of two doubles (3.5 + 2.7): " + calculator.add(3.5, 2.7));

   
        System.out.println("Sum of three doubles (1.1 + 2.2 + 3.3): " + calculator.add(1.1, 2.2, 3.3));
    }
}