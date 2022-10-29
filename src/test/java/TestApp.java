import dhbw.group2.General.Door;
import dhbw.group2.SpacePort.AirTrafficController;
import dhbw.group2.SpacePort.Instructor;
import dhbw.group2.SpacePort.Passenger;
import dhbw.group2.SpacePort.Runway;
import dhbw.group2.SpacePort.Tower.Tower;
import dhbw.group2.SpaceShip.Thruster;
import dhbw.group2.SpaceShip.VirginGalacticSpaceShipTwo;
import dhbw.group2.SpaceShip.WhiteKnightTwo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestApp {

    private VirginGalacticSpaceShipTwo vgsst;
    private WhiteKnightTwo wkt;
    private Door door;

    private Instructor instructor;
    private Passenger passenger;

    private Runway runway;

    private Thruster thruster;

    private Tower tower;
    @BeforeEach
    public void setUp() {
        vgsst = new VirginGalacticSpaceShipTwo();
        wkt = new WhiteKnightTwo(vgsst);
        door = new Door();

        instructor = new Instructor();
        passenger = new Passenger();

        runway = new Runway();

        thruster = new Thruster();
        tower = new Tower();
    }

    @Test
    public void testCriticalFunctionOfShip() {
        assertEquals(500, vgsst.getFuelTank().getAmountOfFuel());
        assertEquals(1000, wkt.getFuelTank().getAmountOfFuel());
        assertNotNull(vgsst.getEmergencyEgress());
        assertNotNull(vgsst.getTps());

        assertEquals(6, vgsst.getPassengers().length);
        assertEquals(2, vgsst.getPilots().length);

        door.close();
        assertTrue(door.isClosed());
        door.open();
        assertFalse(door.isClosed());

        door.lock();
        assertTrue(door.isLocked());
        door.unlock();
        assertFalse(door.isLocked());
    }

    @Test
    public void testInstruction() {
        instructor.instruct(passenger);
        assertTrue(passenger.isInstructed());
    }

    @Test
    public void testRunway() {
        runway.createNewController();
        for (AirTrafficController atc : runway.getControllers()) {
            assertNotNull(atc);
        }
    }

    @Test
    public void testThrusters() {
        thruster.turnOn();
        assertTrue(thruster.isPowered());

        thruster.turnOff();
        assertFalse(thruster.isPowered());
    }

    @Test
    public void testTower() {
        assertNotNull(tower.getMissionControl());
    }

}
