package dhbw.group2.SpacePort;

import java.util.ArrayList;
import java.util.List;

public class Runway {
    private final List<AirTrafficController> controllers = new ArrayList<>();
    private int length;
    private boolean isFree;

    public AirTrafficController createNewController() {
        var controller = new AirTrafficController(this);
        controllers.add(controller);
        return controller;
    }

    public List<AirTrafficController> getControllers() {
        return controllers;
    }
}
