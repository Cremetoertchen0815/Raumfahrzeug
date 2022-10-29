package dhbw.group2.SpaceShip;

import dhbw.group2.SpaceShip.Thruster;
import dhbw.group2.SpaceShip.VirginGalacticSpaceShipTwo;

public class RollThruster extends Thruster {

    private final VirginGalacticSpaceShipTwo spaceship;

    public RollThruster(VirginGalacticSpaceShipTwo ship) {
        spaceship = ship;
    }

    public void setPitch(float value) {
        spaceship.rotation.pitch = value;
    }

    public void setYaw(float value) {
        spaceship.rotation.yaw = value;
    }

}
