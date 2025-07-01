import java.time.Year;

import static java.time.Year.isLeap;

public class LeapYearCalculator {
    public static void main(String[] args) {
        // Easy Method - Intermediate Level
//        int year = 2024;
//        Year y1 = Year.of(year);
//        System.out.println(y1.isLeap());
        // Paglu Method - Beginner Level
        /*
            METHOD:        
            1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
            2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
            3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
            4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
            5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.

         */

        System.out.println(isLeapYear(2028));
    }
    public static boolean isLeapYear(int year){
        boolean isit = false;
        if (year >=1 && year <=9999) {

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isit = true;
                    } else {
                        isit = false;
                    }
                } else {
                    isit = true;
                }
            } else {
                isit = false;
            }
        }

        return isit;
    }
}
