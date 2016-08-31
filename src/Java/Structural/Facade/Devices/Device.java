package Java.Structural.Facade.Devices;

import java.util.UUID;

/**
 * Created by Jack F. Dalton on 0030 30 08 2016.
 */
public abstract class Device {
    private UUID uuid;
    private String label;

    protected Device(String label) {
        this.uuid = UUID.randomUUID();
        this.label = label;
    }

    protected UUID getUuid() {
        return uuid;
    }

    protected void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    protected String getLabel() {
        return label;
    }

    protected void setLabel(String label) {
        this.label = label;
    }
}
