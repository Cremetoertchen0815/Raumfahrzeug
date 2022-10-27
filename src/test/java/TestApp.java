import org.example.Door;
import org.example.VirginGalacticSpaceShipTwo;
import org.example.WhiteKnightTwo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestApp {

    private VirginGalacticSpaceShipTwo vgsst;
    private WhiteKnightTwo wkt;
    private Door d;

    @BeforeEach
    public void setUp() {
        vgsst = new VirginGalacticSpaceShipTwo();
        wkt = new WhiteKnightTwo();
        d = new Door();
    }

    @Test
    public void testCriticalFunction() {
        assertEquals(500, vgsst.getFuelTank().getAmountOfFuel());
        assertEquals(1000, wkt.getFuelTank().getAmountOfFuel());
        assertNotNull(vgsst.getEmergencyEgress());
        assertNotNull(vgsst.getTps());
    }

}
