import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q9 {
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

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade;
        }
    }

    public static void main(String[] args) {
        File file = new File("students.csv");
        List<Student> students = new ArrayList<>();

        if (!file.exists()) {
            System.out.println("File not found: " + file.getAbsolutePath());
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine(); // Read the header

            if (line == null) {
                System.out.println("The file is empty.");
                return;
            }

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 4) {
                    System.out.println("Skipping malformed line: " + line);
                    continue;
                }

                try {
                    int id = Integer.parseInt(data[0].trim());
                    String name = data[1].trim();
                    int age = Integer.parseInt(data[2].trim());
                    String grade = data[3].trim();

                    students.add(new Student(id, name, age, grade));
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid data: " + line);
                }
            }

            if (students.isEmpty()) {
                System.out.println("No valid student data found.");
                return;
            }

            students.sort(Comparator.comparing(Student::getGrade));

            System.out.println("List of students sorted by grade:");
            for (Student student : students) {
                System.out.println(student);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}