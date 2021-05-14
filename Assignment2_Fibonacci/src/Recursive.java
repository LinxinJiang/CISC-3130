public class Recursive {

    public static void main(String[] args) {

        int answer = fib(6);

        System.out.println(answer);
    }


    public static int fib(int i){

        // base case

        if( i == 0){
            return 0;
        }

        if( i <= 2){
            return 1;
        }

        int fib = fib(i-1) + fib(i-2);

        return fib;
    }

}
