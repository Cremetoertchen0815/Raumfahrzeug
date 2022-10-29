package dhbw.group2.SpaceShip.RocketSystem;

import dhbw.group2.General.IEngine;
import dhbw.group2.SpaceShip.Thruster;

public class HybridRocketSystem extends Thruster implements IEngine {
    private CTN ctn = new CTN();
    private OxidizerTank oxidizerTank = new OxidizerTank();
    private MainValveBulkhead mainValveBulkhead = new MainValveBulkhead();

}
