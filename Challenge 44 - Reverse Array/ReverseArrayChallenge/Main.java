package ReverseArrayChallenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 2, 6, 8, 5};
        System.out.println("Array = " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed array = " + Arrays.toString(arr));

    }

    private static void reverse(int[] array){
//        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1 ; i++){

            for (int j = i+1; j < array.length; j++) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

    }
}
