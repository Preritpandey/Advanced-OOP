abstract class GameCharacter {
    public abstract void attack();
    public abstract void defend();
}

class Warrior extends GameCharacter {
    @Override
    public void attack() {
        System.out.println("Warrior attacks with a sword!");
    }

    @Override
    public void defend() {
        System.out.println("Warrior blocks with a shield!");
    }
}

class Archer extends GameCharacter {
    @Override
    public void attack() {
        System.out.println("Archer attacks with a bow and arrow!");
    }

    @Override
    public void defend() {
        System.out.println("Archer dodges the attack gracefully!");
    }
}

// Main class
public class Q4 {
    public static void main(String[] args) {
        GameCharacter warrior = new Warrior();
        GameCharacter archer = new Archer();

        System.out.println("Warrior Actions:");
        warrior.attack();
        warrior.defend();

        System.out.println("\nArcher Actions:");
        archer.attack();
        archer.defend();
    }
}
