package CarpetCostCalculator;

public class Floor {
    // Fields
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    // Constructor
    public Floor(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    // Method double getArea()
    public double getArea() {
        return getLength()*getWidth();
    }

}
