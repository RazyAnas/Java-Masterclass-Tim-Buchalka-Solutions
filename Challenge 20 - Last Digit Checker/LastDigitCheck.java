public class LastDigitCheck {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(54, 88, 987)); // true
    }

    public static boolean hasSameLastDigit(int a, int b, int c){
        if (!isValid(a) || !isValid(b) || !isValid(c)){
            return false;
        }

        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;

        return (lastA == lastB) || (lastB == lastC) || (lastA == lastC);
    }

    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }
}
