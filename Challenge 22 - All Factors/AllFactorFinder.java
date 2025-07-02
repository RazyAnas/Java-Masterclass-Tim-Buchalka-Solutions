/*
Write a method called printFactors with one parameter of type int.

- If the number is < 1, print "Invalid Value".
- The method should print all factors of the given number.
- A factor of a number divides it completely without remainder.

Example:
printFactors(6) → prints: 1 2 3 6 (each on a new line)
*/

public class AllFactorFinder {
    public static void main(String[] args) {
        printFactors(668);
    }
    public static void printFactors(int number){
        int factors = 0;
        if (number < 1){
            System.out.println("Invalid Value");
        }
        int i = 1;
        while (i <= number){
            if (number%i==0){
                factors=i;
                System.out.println(factors);
            }

            i++;

        }

    }
}
