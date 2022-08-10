import java.util.Scanner;

public class ScannerHasNext1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }

        public static int[]  sortIntArrays(int[] array) {
            int[] sortedArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                sortedArray[i] = array[i];
            }
            boolean flag = true;
            int temp;

            while (flag) {
                flag = false;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        flag = true;
                    }

                }
            }
            return sortedArray;
        }


    }
