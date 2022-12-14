package dhbw.group2.General;

import dhbw.group2.SpaceShip.EmergencyEgress;

public class Door extends EmergencyEgress {
    private boolean isClosed;
    private boolean isLocked;

    public void open() {
        isClosed = false;
    }

    public void close() {
        isClosed = true;
    }

    public void lock() {
        isLocked = true;
    }

    public void unlock() {
        isLocked = false;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public boolean isLocked() {
        return isLocked;
    }
}
