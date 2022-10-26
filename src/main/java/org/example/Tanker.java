package org.example;

public class Tanker extends Vehicle {
    private static final int transferAmount = 50;
    private Runway workingRunway;
    private Window window;
    private FuelTank operatingTank = new FuelTank(50);
    private FuelTank transferTank = new FuelTank(500);

    public void FuelOtherTank(FuelTank otherTank) {
        if (transferTank.getAmountOfFuel() <= 0) throw new RuntimeException("Transfer tank empty!");
        transferTank.useFuel(transferAmount);
        otherTank.chargeFuel(transferAmount);
    }

    public void drive(int distance) {
        driver.driveVehicle(this, distance);
    }
}
