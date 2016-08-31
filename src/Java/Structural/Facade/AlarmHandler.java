package Java.Structural.Facade;

import Java.Structural.Facade.Devices.AlarmSensor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jack F. Dalton on 0030 30 08 2016.
 */
public class AlarmHandler {

    private List<AlarmSensor> alarmSensors;

    public AlarmHandler() {
        alarmSensors = new ArrayList<>();
    }

    public void turnOnAlarmSystem() {
        alarmSensors.forEach(as -> as.setActivated(true));
    }

    public void turnoffAlarmSystem() {
        alarmSensors.forEach(as -> as.setActivated(false));
    }
}
