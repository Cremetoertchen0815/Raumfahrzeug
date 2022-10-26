package org.example;

public class Thruster {
    private boolean isOn;

    public void thrust() {
        isOn = true;
    }

    public void stopThrusting() {
        isOn = false;
    }
}
