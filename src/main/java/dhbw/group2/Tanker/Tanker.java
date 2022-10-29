package dhbw.group2.Tanker;

import dhbw.group2.General.FuelTank;
import dhbw.group2.General.Window;
import dhbw.group2.SpacePort.Runway;

public class Tanker extends Vehicle {
    private static final int transferAmount = 50;
    private Runway workingRunway;
    private final Window[] windows = new Window[]{new Window(10), new Window(10), new Window(10), new Window(10)};
    private final FuelTank operatingTank = new FuelTank(50);
    private final FuelTank transferTank = new FuelTank(500);
    private final TankerEngine engine = new TankerEngine();

    public void FuelOtherTank(FuelTank otherTank) {
        if (transferTank.getAmountOfFuel() <= 0) throw new RuntimeException("Transfer tank empty!");
        transferTank.useFuel(transferAmount);
        otherTank.chargeFuel(transferAmount);
    }

    public void drive(int distance) {
        engine.turnOn();
        driver.driveVehicle(this, distance);
    }
}
