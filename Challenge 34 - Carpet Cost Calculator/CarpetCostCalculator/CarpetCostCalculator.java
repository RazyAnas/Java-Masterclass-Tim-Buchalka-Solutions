package CarpetCostCalculator;/*
QUESTION: Carpet Cost Calculator

You need to write 3 classes:

1. Floor:
   - Fields: double width, length
   - Constructor: Floor(double width, double length)
     - If width or length < 0, set to 0
   - Method: double getArea()

2. Carpet:
   - Field: double cost
   - Constructor: Carpet(double cost)
     - If cost < 0, set to 0
   - Method: double getCost()

3. Calculator:
   - Fields: Floor floor, Carpet carpet
   - Constructor: Calculator(Floor floor, Carpet carpet)
   - Method: double getTotalCost()
     - Returns floor area * carpet cost

NOTE:
- All methods should be public
- No main method in the solution
*/


public class CarpetCostCalculator {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}

