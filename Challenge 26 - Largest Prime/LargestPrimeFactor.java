public class LargestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(getLargestPrimeFactor(7));
    }
    public static int getLargestPrimeFactor(int number){
        int largestFactor = 1;
        if (number < 2){
            return  -1;
        }
        for (int i = 2; i <= number; i++){
            int j = 2;
            if (number % i == 0){ // agar i factor hai toh it should not be divisible by any other number

                if (isPrime(i)) {
                    largestFactor = i;
                }

            }

        }
        return largestFactor;
    }

    public static boolean isPrime(int factor) {
        if (factor <= 1) {
            return false;
        }
        for (int i = 2; i <= factor/2; i++) {
            if (factor % i == 0) {
                return false; // not prime
            }
        }
        return true; // prime
    }

}
