/**
 * Represents a person with basic contact details.
 */
public class Person {
    protected String name;
    protected String phoneNumber;
    protected String emailAddress;


    public void purchaseParkingPass() {
        System.out.println(name + " has purchased a parking pass.");
    }
}


class Address {
    private String street;
    private String city;
    private String state;
    private int postalCode;
    private String country;

    public boolean validate() {
        return street != null && !street.isEmpty() &&
               city != null && !city.isEmpty() &&
               state != null && !state.isEmpty() &&
               postalCode > 0 &&
               country != null && !country.isEmpty();
    }


    public String outputAsLabel() {
        return street + ", " + city + ", " + state + " " + postalCode + ", " + country;
    }
}


class Student extends Person {
    private int studentNumber;
    private int averageMark;

 
    public boolean isEligibleToEnroll(String course) {
        return averageMark >= 50; // Example condition
    }


    public int getSeminarsTaken() {
        return 5; // Example value
    }
}


class Professor extends Person {
    private int salary;
    private int staffNumber;
    private int yearsOfService;
    private int numberOfClasses;

  
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
