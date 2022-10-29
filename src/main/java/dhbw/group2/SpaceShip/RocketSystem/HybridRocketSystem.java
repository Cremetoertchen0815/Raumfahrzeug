package dhbw.group2.SpaceShip.RocketSystem;

import dhbw.group2.General.IEngine;
import dhbw.group2.SpaceShip.Thruster;

public class HybridRocketSystem extends Thruster implements IEngine {
    private final CTN ctn = new CTN();
    private final OxidizerTank oxidizerTank = new OxidizerTank();
    private final MainValveBulkhead mainValveBulkhead = new MainValveBulkhead();

}
