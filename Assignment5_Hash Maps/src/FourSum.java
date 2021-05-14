import java.util.HashMap;
import java.util.Map;

public class FourSum {

    public static void main(String[] args) {
        int[] list = {3,4,5,6,1,2};

        int answer[] = twoSum(list,10);

        System.out.println(answer[0]);
        System.out.println(answer[1]);
        System.out.println(answer[2]);
        System.out.println(answer[3]);
    }


    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int x = j + 1; x < nums.length; x++) {
                    int check = target - nums[i] - nums[j] - nums[x];
                    if (map.containsKey(check)) {
                        return new int[]{i, j, x, map.get(check)};
                    }

                    map.put(nums[i], i);
                }

            }

        }

            return new int[]{-1, -1};


    }



}
