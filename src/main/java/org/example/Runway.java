package org.example;

import java.util.ArrayList;
import java.util.List;

public class Runway {
    private int length;
    private boolean isFree;
    private final List<AirTrafficController> controllers = new ArrayList<>();

    public AirTrafficController createNewController() {
        var controller = new AirTrafficController(this);
        controllers.add(controller);
        return controller;
    }
}
