package org.example;

public class Elevons {
    private final VirginGalacticSpaceShipTwo spaceship;

    public Elevons(VirginGalacticSpaceShipTwo ship) {
        spaceship = ship;
    }

    public void setPitch(float value) {
        spaceship.rotation.pitch = value;
    }

    public void setRoll(float value) {
        spaceship.rotation.roll = value;
    }
}
