package org.example;

public class Pilot implements ICommunicator {
    private CommunicationDevice communicationDevice;
    private VirginGalacticSpaceShipTwo spaceship;

    public void messageReceived(int message) {

    }

    public void setSpaceship(VirginGalacticSpaceShipTwo spaceship) {
        this.spaceship = spaceship;
    }
}
