public class BarkingDog {
    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, 1));
    }
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        boolean shouldWakeUp = false;
        if (hourOfDay<0 || hourOfDay >23){
            shouldWakeUp = false;
        } else if (isBarking && hourOfDay < 8 || hourOfDay > 22 ){
            shouldWakeUp = true;
        } else {
            shouldWakeUp = false;
        }
        return shouldWakeUp;
    }
}
