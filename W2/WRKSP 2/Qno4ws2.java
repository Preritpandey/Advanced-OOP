class Person{
    protected String address="123 street abc";
}
class Employee extends Person{
    String department = "it";
    void print(String address){
        System.out.println(super.address);

    }
}

public class Qno4ws2 {
    public static void main(String[] args) {
        
        Employee e1=new Employee();
        e1.print(null);
        
        
    }
}
