import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        boolean flag = true;
        int numberCount = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

            do {

                try {
                    for (int i = 0; i < 5;) {
                        System.out.println("Enter number #" + numberCount);
                        int number = scanner.nextInt();
                        numberCount++;
                        sum += number;
                        i++;

                    }
                    flag = false;
                } catch (Exception e) {
                    scanner.nextLine();
                    System.out.println("Number entered is not an Integer, Please try again!");
                    flag = true;
                }
            } while (flag);

        System.out.println("Your total sum = "+sum);

    }
}
