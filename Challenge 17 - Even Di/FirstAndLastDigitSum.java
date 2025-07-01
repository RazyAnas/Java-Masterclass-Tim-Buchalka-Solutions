public class SumFirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(15558));
    }
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        int sum = 0;
        int i = 0;
        i = number%10;
        while (number>9){
             //this will return last digit;
            number /= 10;
        }
        sum = i + number;
        return sum;
    }
}
