class Person{
    String name;
    int age;
    String address;
    Person(){
        this.age=88;
    }

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    Person(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println();
    }

}

public class Qno15 {
    
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("pittu", 125);
        Person person3 = new Person("p2", 301, "123 ktm newroad");

        System.out.println("Person 1:");
        person1.display();

        System.out.println("Person 2:");
        person2.display();

        System.out.println("Person 3:");
        person3.display();

        
    }
}
