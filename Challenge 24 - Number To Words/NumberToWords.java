public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(199); // Example call
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // Step 1 & 2: Reverse number and store original for later
        int original = number; // save original number
        int reversed = 0; // initialize reverse here

        while (number != 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number = number / 10;
        }

        // Step 3: Print digits in words from reversed number
        while (reversed != 0) {
            int digit = reversed % 10;

            if (digit == 0) System.out.println("Zero");
            else if (digit == 1) System.out.println("One");
            else if (digit == 2) System.out.println("Two");
            else if (digit == 3) System.out.println("Three");
            else if (digit == 4) System.out.println("Four");
            else if (digit == 5) System.out.println("Five");
            else if (digit == 6) System.out.println("Six");
            else if (digit == 7) System.out.println("Seven");
            else if (digit == 8) System.out.println("Eight");
            else if (digit == 9) System.out.println("Nine");

            reversed = reversed / 10;
        }

        // Step 4: Add missing trailing zero(s)
        // → while original ends with zero, reversed number will lose them
        // → So we keep dividing original and stop only when it becomes 0
        while (original % 10 == 0) {
            System.out.println("Zero");
            original = original / 10;
        }

        // Special case: if input is 0, directly print Zero
        if (original == 0 && number == 0) {
            System.out.println("Zero");
        }
    }
}
