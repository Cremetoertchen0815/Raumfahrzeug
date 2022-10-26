package org.example;

public class VirginGalacticSpaceShipTwo {
    public int height;
    public int speed;
    public int apogee;

    //Associations
    private ShipState shipState;
    private WhiteKnightTwo whiteKnightTwo;
    private Window window;
    private Door door;
    private Elevons elevons;
    private FeatherMechanism featherMechanism;
    private Rudder rudder;
    private Thruster thruster = new RollThruster();
    private Cabin cabin = new Cabin();
    private TPS tps = new TPS();
    private NoseSkid noseSkid = new NoseSkid();
    private EmergencyEgress emergencyEgress = new EmergencyEgress();
    private Flight flight;
    private Passenger[] passengers = new Passenger[6];
    private Pilot[] pilots = new Pilot[] {new Pilot(), new Pilot()};
    private HybridRocketSystem rocketSystem;
    private FuelTank fuelTank = new FuelTank(500);

    public void undock() {

    }

    public void startEngine() {
        rocketSystem.turnEngineOff();
    }

    public void turnOffEngine() {
        rocketSystem.turnEngineOn();
    }

    public void takeOff() {
        shipState = ShipState.TAKING_OFF;
        thruster.thrust();
    }

    public void boost() {
        shipState = ShipState.BOOSTING;
    }

    public void reEntry() {
        shipState = ShipState.RE_ENTERING;
    }

    public void glide() {
        shipState = ShipState.GLIDING;
    }

    public void land() {
        shipState = ShipState.LANDING;
    }
}
