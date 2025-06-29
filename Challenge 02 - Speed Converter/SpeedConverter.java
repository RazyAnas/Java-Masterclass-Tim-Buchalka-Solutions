public class SpeedConverter {
    public static void main(String[] args) {

        System.out.println(toMilesPerHour(1.5));
    }
    public static long toMilesPerHour(double kilometersPerHour){
        long value = 0;
        if (kilometersPerHour<0){
            value = -1;
        } else {
            value = Math.round(kilometersPerHour / 1.609);
        }
        return value;
    }
}
