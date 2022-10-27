package org.example;

public class WhiteKnightTwo {
    private final FuelTank fuelTank = new FuelTank(1000);

    private VirginGalacticSpaceShipTwo brother;
    public WhiteKnightTwo(VirginGalacticSpaceShipTwo brother) {
        this.brother = brother;
    }
    public FuelTank getFuelTank() {
        return fuelTank;
    }
}
