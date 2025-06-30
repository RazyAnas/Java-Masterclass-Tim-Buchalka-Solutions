public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        
        int years = (int) (minutes / 525600);
        int days = (int) ((minutes % 525600) / 1440);
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }
}
