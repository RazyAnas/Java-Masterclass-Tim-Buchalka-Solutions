/*
Write a method called getGreatestCommonDivisor with two parameters of type int.

- If either number is < 10, return -1.
- The method should return the greatest common divisor (GCD) of the two numbers.
- GCD is the largest number that divides both numbers completely.

Example:
getGreatestCommonDivisor(25, 15) → returns 5
getGreatestCommonDivisor(12, 30) → returns 6
getGreatestCommonDivisor(9, 18) → returns -1 (because 9 is < 10)
*/

public class HighestCommonFactor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(1055, 545455));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        // GCD is the largest number that divides both numbers completely
        if (first<10 || second<10){
            return -1;
        }
        int gcd = 0;
        for (int i = 1; i <= first || i <= second; i++){
           if (first%i ==0 && second%i == 0){
               gcd = i;
           }
        }
        return gcd;
    }
}
