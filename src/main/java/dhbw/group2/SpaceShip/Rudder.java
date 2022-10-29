package dhbw.group2.SpaceShip;

import dhbw.group2.SpaceShip.VirginGalacticSpaceShipTwo;

public class Rudder {
    private final VirginGalacticSpaceShipTwo spaceship;

    public Rudder(VirginGalacticSpaceShipTwo ship) {
        spaceship = ship;
    }

    public void setYaw(float value) {
        spaceship.rotation.yaw = value;
    }
}
