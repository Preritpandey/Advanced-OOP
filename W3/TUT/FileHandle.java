import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandle {
    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("C:\\Users\\LOQ\\Desktop\\HCK\\ADV OOPs\\W3\\TUT\\data.txt");
        Scanner scan = new Scanner(f1);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
    }
}
 class HandleFile{

 }