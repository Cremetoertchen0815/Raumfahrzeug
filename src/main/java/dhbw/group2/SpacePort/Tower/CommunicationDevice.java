package dhbw.group2.SpacePort.Tower;

import dhbw.group2.SpaceShip.Pilot;

import java.util.ArrayList;
import java.util.List;

public class CommunicationDevice {
    public static List<CommunicationDevice> devices = new ArrayList<>();
    private final ICommunicator creator;

    public CommunicationDevice(ICommunicator creator) {
        this.creator = creator;
        devices.add(this);
    }

    public void sendMessageToPilot(int kindOfMessage) {

        for (var device : devices) {
            if (device.creator instanceof Pilot) {
                device.creator.messageReceived(kindOfMessage);
            }
        }
    }

    public void sendMessageToEngineer(int kindOfMessage) {
        for (var device : devices) {
            if (device.creator instanceof Engineer) {
                device.creator.messageReceived(kindOfMessage);
            }
        }
    }

}
