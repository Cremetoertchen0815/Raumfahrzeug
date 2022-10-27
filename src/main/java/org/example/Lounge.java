package org.example;

import java.util.ArrayList;
import java.util.List;

public class Lounge {
    private final List<Instructor> instructors = new ArrayList<>();
    private final List<Passenger> passengers = new ArrayList<>();

    public Instructor getInstructor() {
        return instructors.get(0);
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }
}
