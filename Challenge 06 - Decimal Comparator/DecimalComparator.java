import java.text.DecimalFormat;
import java.util.Objects;

public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.23, 3.23)); // print
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstDecimal, double secondDecimal){
        
        boolean isIt = false;
        DecimalFormat df = new DecimalFormat("#.###");
        if (Objects.equals(df.format(firstDecimal), df.format(secondDecimal))){
            isIt = true;
        } else {
            isIt = false;
        }
        return isIt;
    }
}
