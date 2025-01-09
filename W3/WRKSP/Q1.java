class Student {
    private int id;
    private String name;
    private int age;
    private char grade;

    public Student(int id, String name, int age, char grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if ("ABCDEF".indexOf(grade) != -1) {
            this.grade = grade;
        } else {
            throw new IllegalArgumentException("Invalid grade. Grade must be A, B, C, D, E, or F.");
        }
    }

    public void displayStudentDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

// Main class
public class Q1 {
    public static void main(String[] args) {
        Student student = new Student(1, "John Doe", 20, 'A');

        System.out.println("Initial Student Details:");
        student.displayStudentDetails();

        student.setId(2);
        student.setName("Jane Smith");
        student.setAge(22);
        student.setGrade('B');

        System.out.println("\nUpdated Student Details:");
        student.displayStudentDetails();
    }
}
