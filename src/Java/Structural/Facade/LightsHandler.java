package Java.Structural.Facade;

import Java.Structural.Facade.Devices.Light;

import java.util.List;

public class LightsHandler {

    private List<Light> houseLights;

    public LightsHandler() { }

    public void registerLight(Light light) {
        houseLights.add(light);
    }

    public void turnOnAllLights() {
        houseLights.forEach(k -> k.setActivated(true));
    }

    public void turnOffAllLights() {
        houseLights.forEach(k -> k.setActivated(false));
    }
}
