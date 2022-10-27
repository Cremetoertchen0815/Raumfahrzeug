package org.example;

import java.util.ArrayList;
import java.util.List;

public class MissionControl {
    private final List<ControlJob> controlJob = new ArrayList<>();
    private final Tower tower;

    public MissionControl(Tower tower) {
        this.tower = tower;
    }

    public List<ControlJob> getControlJob() {
        return controlJob;
    }
}
