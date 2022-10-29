package dhbw.group2.SpaceShip;

public class Elevons {
    private final VirginGalacticSpaceShipTwo spaceship;
    private final ElectricServoHorizontal electricServoHorizontal;

    public Elevons(VirginGalacticSpaceShipTwo ship) {

        spaceship = ship;
        electricServoHorizontal = new ElectricServoHorizontal(this);
    }

    public void setPitch(float value) {
        spaceship.rotation.pitch = value;
    }

    public void setRoll(float value) {
        spaceship.rotation.roll = value;
    }
}
