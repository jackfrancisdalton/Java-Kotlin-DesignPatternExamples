package Java.Creational.Singleton;

/**
 * Created by Jack F. Dalton on 0029 29 08 2016.
 */
public class Person {
    private String fullName;
    private FridgeDoor fridgeDoor;

    public Person(String fullName, FridgeDoor fridgeDoor) {
        this.fullName = fullName;
        this.fridgeDoor = fridgeDoor;
    }

    public void checkFridgeMessage() {
        System.out.println(fullName + " read the message: " + fridgeDoor.getMessage());
    }

    public void changeFridgeMessage(String newMessage) {
        fridgeDoor.setMessage(newMessage);
        System.out.println(fullName + " set a new message");
    }
}
