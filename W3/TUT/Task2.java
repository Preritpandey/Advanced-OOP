public class Task2 {
    public static void main(String[] args) {

    }
}
abstract  class Employee{
    public abstract void  clalculateSalary();
    public void getDeails(){}

}
class FullTimeEmployee extends Employee{

    @Override
    public void clalculateSalary() {
        // TODO Auto-generated method stub
      System.out.println("Calculating your salary....");
    }
    public void getDetails( int months){
        int rate = 100000;
System.out.println(months*rate);
    }
   
}

class PartTimeEmployee extends Employee{

    @Override
    public void clalculateSalary() {
        // TODO Auto-generated method stub
      System.out.println("Calculating your salary....");
    }
    public void getDetails( int hours){
        int rate = 400;
System.out.println(hours*rate);
    }
   
}
