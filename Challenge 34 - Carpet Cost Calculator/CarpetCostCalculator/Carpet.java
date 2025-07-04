package CarpetCostCalculator;

public class Carpet {
    // Fields
    private double cost;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }

    // Constructor
    public Carpet(double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }
}
