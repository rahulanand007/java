package l005_DP;
import java.util.*;

public class ClimbStairs {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        climbStairs(n, new int[n+1]);
        scn.close();
    }

    public static int climbStairs(int n, int[] qb){
        if(n==0){ 
            return 1;
        }else if(n<0){
            return 0;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        int p1 =climbStairs(n-1, qb);
        int p2 =climbStairs(n-2, qb);
        int p3 =climbStairs(n-3, qb);

        qb[n] = p1 + p2 + p3;
        return p1 + p2 +p3;
    }  
}
