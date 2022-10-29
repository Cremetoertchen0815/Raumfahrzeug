package dhbw.group2.SpaceShip;

import dhbw.group2.General.FuelTank;

public class WhiteKnightTwo {
    private final FuelTank fuelTank = new FuelTank(1000);

    private final VirginGalacticSpaceShipTwo brother;

    public WhiteKnightTwo(VirginGalacticSpaceShipTwo brother) {
        this.brother = brother;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }
}
