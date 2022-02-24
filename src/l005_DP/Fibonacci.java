package l005_DP;
import java.util.*;

public class Fibonacci {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fibonacci(n, new int[n+1]));
        scn.close();
    }

    public static int fibonacci(int n , int[] qb){
        if(n==0 || n==1){
            return n;
        }
        if(qb[n] != 0){
            return qb[n];
        }

        int fib1 = fibonacci(n-1, qb);
        int fib2 = fibonacci(n-2, qb);
        int fibans = fib1 +fib2;

        qb[n]=fibans;
        return fibans;
    }
    
}
