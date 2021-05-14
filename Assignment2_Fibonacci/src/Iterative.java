public class Iterative {

    public static void main(String[] args) {

        int answer = fib(6);

        System.out.println(answer);
    }


    public static int fib(int i){

        if( i == 0){
            return 0;
        }

        if(i <= 2) {
            return 1;
        }

        int p = 2;
        int preP = 1;

        for(int x = 3; x < i; x++) {
            int temp = p;
            p = p + preP;
            preP = temp;
        }
        return p;

    }

}
