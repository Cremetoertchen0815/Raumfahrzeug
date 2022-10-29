package dhbw.group2.SpaceShip;

import dhbw.group2.SpacePort.Tower.CommunicationDevice;
import dhbw.group2.SpacePort.Tower.ICommunicator;
import dhbw.group2.SpaceShip.VirginGalacticSpaceShipTwo;

public class Pilot implements ICommunicator {
    private CommunicationDevice communicationDevice;
    private VirginGalacticSpaceShipTwo spaceship;

    public void messageReceived(int message) {

    }

    public void setSpaceship(VirginGalacticSpaceShipTwo spaceship) {
        this.spaceship = spaceship;
    }
}
