/*
Write a method called hasSharedDigit with two parameters of type int.

- Each number must be between 10 and 99 (inclusive).
- If either is not in that range, return false.
- Otherwise, check if the two numbers share at least one digit.
- Return true if they share a digit, false if they don’t.
*/

public class HasSharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(58, 11));
    }
    public static boolean hasSharedDigit(int first, int second){
        if (first < 10 || second < 10){
            return false;
        }
        int firstDigit = 0;
        int secondDigit = 0;
        while (first > 9 && second > 9){ // number must be greater than 9 then only partition it!
            //assume number = 121
            firstDigit = first%10; // this will return last digit i.e from right 1
            secondDigit = second%10;
            // now we have to make the number 12 instead of 121
            first /= 10;
            second /= 10;
            if (firstDigit == secondDigit){
                return true;
            }
        }
        if (first == second){
            return true;
        }
        return false;
    }
}
