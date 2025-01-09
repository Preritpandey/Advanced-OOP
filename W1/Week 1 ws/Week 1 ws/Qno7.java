import java.util.Scanner;

public class Qno7 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double height = inp.nextDouble();
        int radius = inp.nextInt();
        
        double volume=3.14*radius*radius*height;
        System.out.println("the volume of cyclinder is"+volume);
        inp.close();
    }
    
}
