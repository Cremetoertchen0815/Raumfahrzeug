package org.example;

public class FeatherMechanism {
    private boolean actuated;
    private boolean locked;

    public boolean isActuated() {
        return actuated;
    }

    public void setActuated(boolean actuated) {
        this.actuated = actuated;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
