import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
            System.out.println("Enter the tmep in celcius");
            double celcius = inp.nextDouble();
            double far = (celcius*1.8)+32;
        System.out.println("The temp is "+far);
    }
}