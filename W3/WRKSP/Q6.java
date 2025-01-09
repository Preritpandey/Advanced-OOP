interface RemoteControl {
    void powerOn();
    void powerOff();
}

class TV implements RemoteControl {
    @Override
    public void powerOn() {
        System.out.println("TV is now ON.");
    }

    @Override
    public void powerOff() {
        System.out.println("TV is now OFF.");
    }
}

class AC implements RemoteControl {
    @Override
    public void powerOn() {
        System.out.println("AC is now ON.");
    }

    @Override
    public void powerOff() {
        System.out.println("AC is now OFF.");
    }
}

// Main class
public class Q6 {
    public static void main(String[] args) {
        RemoteControl tv = new TV();
        RemoteControl ac = new AC();

        System.out.println("TV Actions:");
        tv.powerOn();
        tv.powerOff();

        System.out.println("\nAC Actions:");
        ac.powerOn();
        ac.powerOff();
    }
}
