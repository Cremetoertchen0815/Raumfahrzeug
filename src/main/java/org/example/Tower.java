package org.example;

public class Tower {
    private MissionControl missionControl;

    public Tower() {
        missionControl = new MissionControl(this);
    }
}
