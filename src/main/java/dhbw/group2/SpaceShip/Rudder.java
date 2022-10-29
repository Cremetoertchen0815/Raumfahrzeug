package dhbw.group2.SpaceShip;

public class Rudder {
    private final VirginGalacticSpaceShipTwo spaceship;

    public Rudder(VirginGalacticSpaceShipTwo ship) {
        spaceship = ship;
    }

    public void setYaw(float value) {
        spaceship.rotation.yaw = value;
    }
}
