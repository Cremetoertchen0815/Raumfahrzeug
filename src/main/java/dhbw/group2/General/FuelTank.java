package dhbw.group2.General;

public class FuelTank {
    private int amountOfFuel;

    public FuelTank(int initalCapacity) {
        amountOfFuel = initalCapacity;
    }

    public int getAmountOfFuel() {
        return amountOfFuel;
    }

    public void useFuel(int amount) {
        if (amount < 0) throw new RuntimeException("Can't use up negative fuel!");
        amountOfFuel -= amount;
    }

    public void chargeFuel(int amount) {
        if (amount < 0) throw new RuntimeException("Can't fill up with negative fuel!");
        amountOfFuel += amount;
    }
}
