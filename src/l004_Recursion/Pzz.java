package l004_Recursion;
import java.util.Scanner;

public class Pzz {

    public static void pzz(int n){
        if(n==0){
            return;
        }
        System.out.print(n +" ");
        pzz(n-1);
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");    
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pzz(n);
        scn.close();
    }
    
}
