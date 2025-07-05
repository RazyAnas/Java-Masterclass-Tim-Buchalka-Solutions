package PoolArea;
/*
Question:
Create two classes: `Rectangle` and `Cuboid`.

1. The `Rectangle` class should have:
   - Two `double` fields: `width` and `length`.
   - A constructor that sets both values. If any value < 0, set it to 0.
   - A method `getWidth()` that returns width.
   - A method `getLength()` that returns length.
   - A method `getArea()` that returns width × length.

2. The `Cuboid` class should:
   - Extend `Rectangle`.
   - Have a `double` field `height`.
   - A constructor that takes width, length, and height. If height < 0, set it to 0.
   - A method `getHeight()` that returns height.
   - A method `getVolume()` that returns area × height.
*/

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle width: " + rectangle.getWidth());
        System.out.println("Rectangle length: " + rectangle.getLength());
        System.out.println("Rectangle area: " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 3);
        System.out.println("Cuboid width: " + cuboid.getWidth());
        System.out.println("Cuboid length: " + cuboid.getLength());
        System.out.println("Cuboid height: " + cuboid.getHeight());
        System.out.println("Cuboid area (base): " + cuboid.getArea());
        System.out.println("Cuboid volume: " + cuboid.getVolume());
    }
}
