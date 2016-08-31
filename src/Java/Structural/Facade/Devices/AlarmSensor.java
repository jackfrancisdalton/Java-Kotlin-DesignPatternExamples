package Java.Structural.Facade.Devices;

/**
 * Created by Jack F. Dalton on 0030 30 08 2016.
 */
public class AlarmSensor {
    private boolean activated;

    public AlarmSensor(){

    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
