public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(155551));
    }
    public static boolean isPalindrome(int number){
        // how to find Palindrome?:
        int original = number;
        int i = 0;
        int reverse = 0;
        while (number>9){ // number must be greater than 9 then only partition it!
            //assume number = 121
            i = number%10; // this will return last digit i.e from right 1
            // now we have to make the number 12 instead of 121
            number /= 10;
            reverse = reverse * 10 + i ;



        }
        // now we have got each digits we gotta make it reverse
        reverse = reverse * 10 + number;
//        System.out.println(reverse);

        if (reverse == original){
            return true;
        }else {
            return false;
        }
    }
}
