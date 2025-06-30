public class NumberOfDaysInMonth {
    /*
    Instructions:
        Write a method isLeapYear with a parameter of type int named year.
        The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
        If the parameter is not in that range return false.
        Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
        A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
     */
    public static void main(String[] args) {
        System.out.println(isLeapYear(2025));
        System.out.println(getDaysInMonth(3,2021));
    }

    public static boolean isLeapYear(int year){
        if (year >=1 && year <=9999) {

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        int numberOfDays = 0;
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        } else {
            return switch (month){
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> isLeapYear(year) ? 29 : 28;
                default -> 30;
            };

        }
    }

}
