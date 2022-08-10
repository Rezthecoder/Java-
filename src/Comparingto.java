import java.util.Arrays;

public class Comparingto {
    static String first = "Suresh Lama";
    static String second ="Suresh";

    public static void main(String[] args) {
        //reference type doesn't change the value of array and the variable

      int[] firstIntegers =  new int[5];
      int[] secondIntegers = firstIntegers;
        System.out.println("Arrays at the first " + Arrays.toString(firstIntegers));
        System.out.println("Arrays at the second" + Arrays.toString(secondIntegers));
        secondIntegers[2] = 10;
        System.out.println("Arrays at the first " + Arrays.toString(firstIntegers));
        System.out.println("Arrays at the second" + Arrays.toString(secondIntegers));

secondIntegers = new int[5];
        modifyArray(firstIntegers);
        System.out.println("Arrays at the first  after modify " + Arrays.toString(firstIntegers));
        System.out.println("Arrays at the second after modify " + Arrays.toString(secondIntegers));
//new keyword to not reference the value because new is used to make new object


    }
    public static  void modifyArray(int[] array){
        array[2] = 5;
    }
}
