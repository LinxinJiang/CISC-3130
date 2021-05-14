import java.util.HashMap;
import java.util.Map;

public class FibonacciHashMap {

    /*
        Time: O(1)

        This is better because it's faster.

    */

    public static void main(String[] args) {



        Map<Integer,Integer> map = new HashMap<>();

        System.out.println(fibonacci(10,map));

    }

    public static int fibonacci(int n, Map<Integer,Integer> map){

        // base case
        if(n <= 2){
            return 1;
        }

        // check map
        if(map == null){
            map = new HashMap<>();
        }


        // if map contain key, return it
        if(map.containsKey(n)){
            return map.get(n);
        }

        map.put(n,fibonacci(n-1,map) + fibonacci(n-2,map));

        // return the value
        return map.get(n);

    }

}
