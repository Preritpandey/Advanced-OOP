class Animal {
    public void sound() {
        System.out.println("Animal sound.");
    }
}

// Dog
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barking bhow bhow ");
    }
}

//  Cat
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("cat meo meo");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        genericAnimal.sound();
        dog.sound();
        cat.sound();
    }
}
