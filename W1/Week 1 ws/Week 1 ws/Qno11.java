import java.util.Scanner;

public class Qno11 {
    public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    int miles = inp.nextInt();
    double kilometers = miles * 1.60934;
    System.out.println(kilometers);
    inp.close();

    }
}
