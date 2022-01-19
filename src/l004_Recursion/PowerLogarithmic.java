package l004_Recursion;
import java.util.Scanner;

public class PowerLogarithmic{
    public static boolean even(int n){
        if(n%2==0){
            return true;
        }else return false;
    }

    public static int powerLogarithmic(int base, int power){
        if(power==0)
        return 1;
            int ans =0;
        if(even(power)){
                 ans = powerLogarithmic(base, power/2) * powerLogarithmic(base, power/2);
        }else{
                ans = base * powerLogarithmic(base, power/2) * powerLogarithmic(base, power/2);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt(), n = scn.nextInt();
        System.out.println(powerLogarithmic(x, n));
        scn.close();
    }
}