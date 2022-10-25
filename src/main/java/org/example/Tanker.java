package org.example;

public class Tanker extends Vehicle {
    private Runway workingRunway;
    private Window window;
    private FuelTank operatingTank;
    private FuelTank transferTank;

    public void FuelOtherTank(FuelTank otherTank) {

    }

    public void drive(int distance) {
        driver.driveVehicle(this, distance);
    }
}
