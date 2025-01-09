import java.util.Scanner;

public class Qno12 {
    public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    int radius = inp.nextInt();
    double area = 3.14 * radius * radius;
    System.out.println(area);
    inp.close();
    }
}
