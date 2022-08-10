import java.util.ArrayList;
import java.util.Arrays;

public class ReverseInt {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println("Original array: " + Arrays.toString(array));
         reverseInt(array);
        System.out.println("Reversed array: " + Arrays.toString(array));

        ArrayList<Integer> arrayList = new ArrayList<Integer>();



    }

    private static void reverseArray(int[] array) {
    }

    public static void reverseInt(int[] array) {
        int max = array.length - 1;
        int halfindex = array.length / 2;
        for (int i = 0; i < halfindex; i++) {
            int temp = array[i];
            array[i] = array[max - i];
            array[max - i] = temp;

        }
    }
}


