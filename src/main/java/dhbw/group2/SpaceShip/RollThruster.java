package dhbw.group2.SpaceShip;

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
