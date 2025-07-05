package Shapes;
/*
Question:
Create two classes: `Circle` and `Cylinder`.

1. The `Circle` class should have:
   - A `double` field `radius`.
   - A constructor that sets `radius`. If radius < 0, set it to 0.
   - A method `getRadius()` that returns the radius.
   - A method `getArea()` that returns the area of the circle (π * r^2).

2. The `Cylinder` class should:
   - Extend `Circle`.
   - Have a `double` field `height`.
   - A constructor that takes radius and height. If height < 0, set it to 0.
   - A method `getHeight()` that returns height.
   - A method `getVolume()` that returns volume (area of base * height).
*/
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("Cylinder radius: " + cylinder.getRadius());
        System.out.println("Cylinder height: " + cylinder.getHeight());
        System.out.println("Cylinder area (base): " + cylinder.getArea());
        System.out.println("Cylinder volume: " + cylinder.getVolume());
    }
}