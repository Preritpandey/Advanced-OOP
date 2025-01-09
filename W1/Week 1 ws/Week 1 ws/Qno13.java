import java.util.Scanner;

public class Qno13 {
    public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    int quantity = inp.nextInt();
    int rate = inp.nextInt();
    System.out.println(rate*quantity);
    inp.close();
    }
}
