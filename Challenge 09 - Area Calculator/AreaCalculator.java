public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(2));
        System.out.println(area(2, 8));
    }
    // for circle
    public static double area(double radius){
        double areaIs = 0;
        if (radius < 0){
            areaIs = -1; // invalid value of radius
            return areaIs;
        } else {
            areaIs = Math.PI*radius*radius; // formula
            return areaIs;
        }
    }
    // for rectangle
    public static double area(double length, double breadth){
        double areaIs = 0;
        if (length < 0 || breadth < 0){
            areaIs = -1; // invalid value of length/breadth
            return areaIs;
        } else {
            areaIs = length * breadth; // formula
            return areaIs;
        }
    }

}
