package dhbw.group2.SpaceShip;

public class Thruster {
    private boolean isOn;

    public boolean isPowered() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

}
