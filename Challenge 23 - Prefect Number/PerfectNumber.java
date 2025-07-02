/*
Write a method called isPerfectNumber with one int parameter.

- If number < 1 → return false.
- A perfect number is a number which is equal to the sum of all its proper divisors (excluding itself).
- Return true if the number is perfect, otherwise return false.

Example:
isPerfectNumber(6) → true (1 + 2 + 3 = 6)
isPerfectNumber(28) → true (1 + 2 + 4 + 7 + 14 = 28)
isPerfectNumber(5) → false
*/

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(5));
    }
    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++){ // finding all the divisors excluding itself
            if (number % i == 0){
                sum += i; // adding each divisor found)
            }
        }
        // checking if the sum total of all divisors is equal to the number itself, if yes true
        if (number == sum){
            return true;
        }

        return false;
    }
}
