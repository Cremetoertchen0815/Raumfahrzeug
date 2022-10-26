package org.example;

import java.util.ArrayList;
import java.util.List;

public class Lounge {
    private Instructor instructor = new Instructor();
    private List<Passenger> passengers = new ArrayList<>();

    public Instructor getInstructor() {
        return instructor;
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }
}
