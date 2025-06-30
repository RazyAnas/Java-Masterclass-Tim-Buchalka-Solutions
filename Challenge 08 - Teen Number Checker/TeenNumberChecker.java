public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(23,19,22));
        System.out.println(isTeen(13));
    }
    public static boolean hasTeen(int age1, int age2, int age3){
        if ((age1 >= 13 && age1 <=19) || (age2 >= 13 && age2 <=19) || (age3 >= 13 && age3 <=19)){
            return true;
        } else {
            return false;
        }
    }
    public static boolean isTeen(int age){
        if (age >= 13 && age <= 19){
            return true;
        } else {
            return false;
        }
    }
}
