class Parent{
    private String address="123 one";
    protected int age=90;
    public String name="sidd";

    protected String getAddress(){
        return address;
    }



}
class Son extends Parent{
    public Son(){
        super();
    }
    void printData(){
        System.out.println(super.name);
        System.out.println(super.age);
        System.out.println(super.getAddress());
        

    }
}

public class Qno5ws2 {
    public static void main(String[] args) {
        Son c1= new Son();
        c1.printData();
    }
}
