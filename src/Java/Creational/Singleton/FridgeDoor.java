package Java.Creational.Singleton;

/**
 * Created by Jack F. Dalton on 0029 29 08 2016.
 */
public class FridgeDoor {

    private static FridgeDoor instance;
    private String message;

    private FridgeDoor() {
        message = "";
    }

    public static FridgeDoor getInstance() {
        if(instance == null)
            instance = new FridgeDoor();

        return instance;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
