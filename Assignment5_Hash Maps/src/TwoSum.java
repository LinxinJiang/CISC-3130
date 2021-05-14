import java.util.Map;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] list = {3,4,5};

        int answer[] = twoSum(list,9);

        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }


    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            int check = target - nums[i];
            if(map.containsKey(check)){
                return new int[]{i, map.get(check)};
            }

            map.put(nums[i],i);


        }

        return new int[]{-1,-1};

    }

}
