package dhbw.group2.SpaceShip;

import dhbw.group2.General.Door;
import dhbw.group2.General.FuelTank;
import dhbw.group2.General.Window;
import dhbw.group2.SpacePort.Passenger;
import dhbw.group2.SpaceShip.RocketSystem.HybridRocketSystem;

import java.util.ArrayList;
import java.util.List;

public class VirginGalacticSpaceShipTwo {
    //Associations
    private ShipState shipState = null;
    private final List<Flight> flight = new ArrayList<>();
    private final WhiteKnightTwo whiteKnightTwo ;
    private final Window[] windows;
    private final Door door = new Door();
    private final Elevons[] elevons;
    private final FeatherMechanism[] featherMechanism = new FeatherMechanism[] { new FeatherMechanism(), new FeatherMechanism()};
    private final Rudder[] rudder;
    private final Thruster[] thruster;
    private final Cabin cabin = new Cabin(3.7f);
    private final TPS tps = new TPS();
    private final NoseSkid noseSkid = new NoseSkid();
    private final EmergencyEgress emergencyEgress = new EmergencyEgress();
    private final Passenger[] passengers = new Passenger[6];
    private final Pilot[] pilots = new Pilot[] {new Pilot(), new Pilot()};
    private final HybridRocketSystem rocketSystem = new HybridRocketSystem();
    private final FuelTank fuelTank = new FuelTank(500);

    //Fields
    public int height;
    public int speed;
    public int apogee;
    public YawPitchRoll rotation;

    public VirginGalacticSpaceShipTwo() {
        elevons = new Elevons[] { new Elevons(this),  new Elevons(this)};
        rudder = new Rudder[] { new Rudder(this), new Rudder(this)};
        thruster = new Thruster[] { new RollThruster(this), new RollThruster(this)};
        whiteKnightTwo = new WhiteKnightTwo(this);

        //Create windows
        windows = new Window[21];
        int idx = 0;
        for (int i = 0; i < 8; i++) windows[idx++] = new Window(43); //Add side windows
        for (int i = 0; i < 8; i++) windows[idx++] = new Window(33); //Add top windows
        for (int i = 0; i < 5; i++) windows[idx++] = new Window(53); //Add crew station windows
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
        return windows;
    }

    public Door getDoor() {
        return door;
    }

    public Elevons[] getElevons() {
        return elevons;
    }

    public FeatherMechanism[] getFeatherMechanism() {
        return featherMechanism;
    }

    public Rudder[] getRudder() {
        return rudder;
    }

    public Thruster[] getThruster() {
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
