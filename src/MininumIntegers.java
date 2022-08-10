import java.util.Arrays;
import java.util.Scanner;

public class MininumIntegers {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
int[] sample = readIntegers(5);
        System.out.println(Arrays.toString(sample));
        int findMinimum = findMinimum(sample);
        System.out.println("Minimum value is " + findMinimum);

    }

    public static int[] readIntegers(int count) {
        int[] integers = new int[count];
        for(int i =0; i<integers.length;i++){

            System.out.println("Enter a number: ");
           int number = scanner.nextInt();
           scanner.nextLine();
           integers[i] = number;

        }
        return integers;


    }

    public static int findMinimum(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i =0; i< array.length;i++){
          int number =  array[i];
          if(number<min){
              min = number;
          }

        }
        return min;

    }

}