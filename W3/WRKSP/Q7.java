import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("foods.txt");

        try {

            if (!file.exists()) {
                file.createNewFile();
            }


            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Enter food names. Type 'exit' to stop.");

            while (true) {
                System.out.print("Enter food name: ");
                String food = scanner.nextLine();

                if (food.equalsIgnoreCase("exit")) {
                    break;
                }


                bufferedWriter.write(food);
                bufferedWriter.newLine();
            }


            bufferedWriter.close();
            scanner.close();

            System.out.println("Food list has been saved to foods.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
