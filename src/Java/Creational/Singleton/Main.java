package Java.Creational.Singleton;

public class Main {

    public static void main(String[] args) {

        Person jack = new Person("Jack Dalton", FridgeDoor.getInstance());
        Person ed = new Person("Ed Woollard", FridgeDoor.getInstance());

        jack.changeFridgeMessage("Ed have you paid the internet bills yet?");
        ed.checkFridgeMessage();
        ed.changeFridgeMessage("Yes, it's all paid for.");
        jack.checkFridgeMessage();
    }
}
