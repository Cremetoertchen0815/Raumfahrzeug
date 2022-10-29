package dhbw.group2.Tanker;

import dhbw.group2.General.IEngine;

public class TankerEngine implements IEngine {
    private boolean isOn;

    @Override
    public boolean isPowered() {
        return isOn;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }
}
