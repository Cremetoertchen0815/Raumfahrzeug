package org.example;

public class Thruster {
    private boolean isOn;
    private final VirginGalacticSpaceShipTwo spaceship;
    public Thruster(VirginGalacticSpaceShipTwo ship) {
        spaceship = ship;
    }

    public void thrust() {
        isOn = true;
    }

    public void stopThrusting() {
        isOn = false;
    }


    public void setPitch(float value) {
        spaceship.rotation.pitch = value;
    }

    public void setYaw(float value) {
        spaceship.rotation.yaw = value;
    }
}
