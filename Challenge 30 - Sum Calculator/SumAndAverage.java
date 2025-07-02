/*
Write a method called inputThenPrintSumAndAverage().

This method should:
- Read numbers from the user input (one at a time)
- Stop reading when the user enters anything that's not an integer
- Then print the **sum** and **average (rounded)** of all entered numbers

Output format:
SUM = X AVG = Y

Rules:
- If no numbers were entered, sum = 0 and average = 0
- Use Scanner to read input
- Use Math.round to round the average
- Example:
    Input: 1 2 3 a
    Output: SUM = 6 AVG = 2
*/

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage(); // ✅ Just call the method here

    }
    public static void inputThenPrintSumAndAverage(){
        int count = 0;
        int sum = 0;
        int average = 0;
        Scanner sc = new Scanner(System.in);
        while (true){
            try {

                int number = Integer.parseInt(sc.next());
                count++;
                sum += number;
            } catch (Exception e){
                average = sum/count;
                System.out.println("AVG = " + average + " SUM = " + sum);
                break;
            }

        }

    }
}
