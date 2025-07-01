public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(859658));
    }
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int i = 0;
        int sum = 0;
        while (number>9){ // number must be greater than 9 then only partition it!
            //assume number = 121
            i = number%10; // this will return last digit i.e from right 1
            // now we have to make the number 12 instead of 121
            number /= 10;

            if (i%2==0){
                sum += i;
            }

        }

        if (number%2==0){
            sum += number;
        }

        return sum;
    }

}
