public class Q6 {

    public static void main(String[] args) {
        Animal dog = new Animal("Dog","Bhau bhau bhau");
        Animal cat = new Animal("cat","Meow meow");
        cat.makeSound();
        dog.makeSound();
    }
}
class Animal{
    String animalName;
    String animalSound;

    public Animal(String animalName, String animalSound) {
        this.animalName = animalName;
        this.animalSound = animalSound;
    }
  
    void makeSound(){
        System.out.println("my sound is " + animalSound );
    }

}
class Te st extends Animal{

}