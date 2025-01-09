import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q8 {
    static class Student {
        private int id;
        private String name;
        private int age;
        private String grade;

        public Student(int id, String name, int age, String grade) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getGrade() {
            return grade;
        }
    }

    public static void main(String[] args) {
        File file = new File("students.csv");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Error creating the file: " + e.getMessage());
            return;
        }

        try (
            Scanner scanner = new Scanner(System.in);
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            if (file.length() == 0) {
                bufferedWriter.write("ID,Name,Age,Grade\n");
            }

            System.out.println("Enter student information. Type 'exit' to stop.");

            while (true) {
                try {
                    System.out.print("Enter student ID: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine().trim();

                    if (name.isEmpty()) {
                        System.out.println("Name cannot be empty. Please try again.");
                        continue;
                    }

                    System.out.print("Enter student age: ");
                    int age = Integer.parseInt(scanner.nextLine());

                    if (age <= 0) {
                        System.out.println("Age must be a positive number. Please try again.");
                        continue;
                    }

                    System.out.print("Enter student grade (A, B, C, D, E, F): ");
                    String grade = scanner.nextLine().trim().toUpperCase();

                    if (!grade.matches("[A-F]")) {
                        System.out.println("Grade must be one of A, B, C, D, E, F. Please try again.");
                        continue;
                    }

                    Student student = new Student(id, name, age, grade);
                    bufferedWriter.write(student.getId() + "," + student.getName() + "," + student.getAge() + "," + student.getGrade() + "\n");

                    System.out.print("Do you want to add another student? (yes/no): ");
                    String response = scanner.nextLine().trim();
                    if (response.equalsIgnoreCase("no")) {
                        break;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Invalid input. Please enter a valid number for ID and age.");
                }
            }

            System.out.println("Student information has been saved to students.csv.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}