/*
QUESTION: Point Distance

Write a class named `Point` with the following:

Fields:
- two instance variables `x` and `y` of type int.

Constructors:
1. A no-args constructor
2. A constructor with two int parameters (x and y) to initialize the fields

Methods:
1. `getX()` and `setX(int x)` – getter and setter for x
2. `getY()` and `setY(int y)` – getter and setter for y
3. `distance()` – returns distance from this point to (0, 0)
4. `distance(Point a)` – returns distance from this point to another point object
5. `distance(int x, int y)` – returns distance from this point to another x,y point

NOTE:
- Use `Math.sqrt()` for distance calculation using the formula:
    distance = √[(x2 - x1)² + (y2 - y1)²]
- All methods should be public.
- No main method is needed in the solution.
*/

public class Point {
    // two instance variables x and y of type int
    private int x;
    private int y;

    // constructors as required per question
    public Point() {
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // instance methods per question


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    // distance instance methods
    public double distance() {
        // get x and y
        int x2 = 0;
        int y2 = 0;
        int x1 = getX();
        int y1 = getY();

        return Math.sqrt(((x2 - x1)*(x2 - x1))  + ((y2 - y1)*(y2 - y1)));
    }
    public double distance(Point a) {
        int x2 = a.x;
        int y2 = a.y;
        int x1 = getX();
        int y1 = getY();

        return Math.sqrt(((x2 - x1)*(x2 - x1))  + ((y2 - y1)*(y2 - y1)));
    }
    public double distance(int x, int y) {
        int x2 = x;
        int y2 = y;
        int x1 = getX();
        int y1 = getY();

        return Math.sqrt(((x2 - x1)*(x2 - x1))  + ((y2 - y1)*(y2 - y1)));
    }


}
