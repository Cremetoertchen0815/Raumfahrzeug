package org.example;

public class CommunicationDevice {
    private Engineer engineer;
    private Pilot pilot;
    private void sendMessageToPilot(int kindOfMessage) {
        pilot.messageReceived(kindOfMessage);
    }

    private void sendMessageToEngineer(int kindOfMessage) {
        engineer.messageReceived(kindOfMessage);
    }

    public void setEngineer(Engineer engineer) {
        this.engineer = engineer;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }
}
