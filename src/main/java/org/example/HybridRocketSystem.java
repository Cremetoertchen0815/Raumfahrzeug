package org.example;

public class HybridRocketSystem {
    private boolean enginePowerState;

    public boolean isEnginePowered() {
        return enginePowerState;
    }
    public void turnEngineOn() {
        enginePowerState = true;
    }

    public void turnEngineOff() {
        enginePowerState = false;
    }
    private CTN ctn = new CTN();
    private OxidizerTank oxidizerTank = new OxidizerTank();
    private MainValveBulkhead mainValveBulkhead = new MainValveBulkhead();
}
