package dhbw.group2.SpacePort.Tower;

public class Tower {
    private final MissionControl missionControl;

    public Tower() {
        missionControl = new MissionControl(this);
    }

    public MissionControl getMissionControl() {
        return missionControl;
    }
}
