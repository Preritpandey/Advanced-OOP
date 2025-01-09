class Animal{
    String name;
    int age;
    public Animal(String name,int age){
    this.name=name;
    this.age=age;
    }
    
    }
    class Dog extends Animal{
        String breed;
        public Dog(String name,int age,String breed){
            super(name, age);
            this.breed=breed;
    
    
        }
    
    }
    
    public class Qno3ws2{
        public static void main(String[] args) {
            Animal An=new Animal("pittu",93);
            System.out.println(An.name);
            System.out.println(An.age);
            Dog doggo = new Dog("one", 10, "breed");
            System.out.println(doggo.name);
            System.out.println(doggo.breed);
        }
    }