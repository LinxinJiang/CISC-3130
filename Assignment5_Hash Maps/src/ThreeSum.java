import java.util.HashMap;
import java.util.Map;

public class ThreeSum {

    public static void main(String[] args) {
        int[] list = {3,4,5,6,1};

        int answer[] = twoSum(list,10);

        System.out.println(answer[0]);
        System.out.println(answer[1]);
        System.out.println(answer[2]);
    }


    public static int[] twoSum(int[] nums, int target) {

       Map<Integer,Integer> map = new HashMap<>();

       for(int i = 0; i < nums.length; i++){
           for(int j = i+1; j < nums.length; j++){
               int check = target - nums[i] - nums[j];
               if(map.containsKey(check)){
                    return new int[]{i,j, map.get(check)};
               }

               map.put(nums[i],i);
           }

       }

       return new int[]{-1,-1};


    }

}
