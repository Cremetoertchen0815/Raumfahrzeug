package dhbw.group2.SpacePort.Tower;

import dhbw.group2.SpacePort.Tower.MissionControl;

public class Tower {
    private MissionControl missionControl;

    public Tower() {
        missionControl = new MissionControl(this);
    }

    public MissionControl getMissionControl() {
        return missionControl;
    }
}
