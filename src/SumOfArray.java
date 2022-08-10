import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfArray {

    public static void main(String[] args) {
 int[] newthings =twoSums(new int[]{3, 7, 5},8);
        System.out.println(Arrays.toString(newthings));



    }
//5,6,7  =11
    public static int[] twoSums(int[] nums, int target ){
        Map<Integer, Integer> compliments = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            Integer complimentIndex = compliments.get(nums[i]);
            System.out.println(nums[i]);
            System.out.println( "compiment index " + complimentIndex);
            if(complimentIndex != null){
                return new int[]{complimentIndex, i};
            }
            else {
                compliments.put(target - nums[i], i);
                System.out.println(compliments);
            }

        }
        return nums;
}
}
