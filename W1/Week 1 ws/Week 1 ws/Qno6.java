import java.util.Scanner;

public class Qno6 {
    public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    double rate = inp.nextDouble();
    int principle = inp.nextInt();
    double time = inp.nextDouble();
    double si=(principle*time*rate)/2;
    System.out.println("the si is"+si);
    inp.close();
    }
}
