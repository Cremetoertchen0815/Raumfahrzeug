package org.example;

public class VirginGalacticSpaceShipTwo {
    public int height;
    public int speed;
    public int apogee;
    public YawPitchRoll rotation;

    //Associations
    private ShipState shipState = null;
    private final WhiteKnightTwo whiteKnightTwo = new WhiteKnightTwo();
    private final Window windowSide = new Window(43);
    private final Window windowTop = new Window(33);
    private final Window windowCrewStation = new Window(53);
    private final Door door = new Door();
    private final Elevons elevons;
    private final FeatherMechanism featherMechanism = new FeatherMechanism();
    private final Rudder rudder;
    private final Thruster thruster;
    private final Cabin cabin = new Cabin(3.7f);
    private final TPS tps = new TPS();
    private final NoseSkid noseSkid = new NoseSkid();
    private final EmergencyEgress emergencyEgress = new EmergencyEgress();
    private Flight flight;
    private final Passenger[] passengers = new Passenger[6];
    private final Pilot[] pilots = new Pilot[]{new Pilot(), new Pilot()};
    private final HybridRocketSystem rocketSystem = new HybridRocketSystem();
    private final FuelTank fuelTank = new FuelTank(500);

    public VirginGalacticSpaceShipTwo() {
        elevons = new Elevons(this);
        rudder = new Rudder(this);
        thruster = new RollThruster(this);
    }

    public void undock() {

    }

    public void startEngine() {
        rocketSystem.turnOff();
    }

    public void turnOffEngine() {
        rocketSystem.turnOn();
    }

    public void takeOff() {
        shipState = ShipState.TAKING_OFF;
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

    public ShipState getShipState() {
        return shipState;
    }

    public WhiteKnightTwo getWhiteKnightTwo() {
        return whiteKnightTwo;
    }

    public Window[] getWindows() {
        return new Window[] {windowSide, windowTop, windowCrewStation};
    }

    public Door getDoor() {
        return door;
    }

    public Elevons getElevons() {
        return elevons;
    }

    public FeatherMechanism getFeatherMechanism() {
        return featherMechanism;
    }

    public Rudder getRudder() {
        return rudder;
    }

    public Thruster getThruster() {
        return thruster;
    }

    public Cabin getCabin() {
        return cabin;
    }

    public TPS getTps() {
        return tps;
    }

    public NoseSkid getNoseSkid() {
        return noseSkid;
    }

    public EmergencyEgress getEmergencyEgress() {
        return emergencyEgress;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public Pilot[] getPilots() {
        return pilots;
    }

    public HybridRocketSystem getRocketSystem() {
        return rocketSystem;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }
}
