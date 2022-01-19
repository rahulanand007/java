package l004_Recursion;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void toh(int n,int n1,int n2,int n3){
        if(n==0){
            return;
        }
        toh(n-1,n1,n3,n2);
        System.out.println(n+"["+n1+" ->"+n2+"]");
        toh(n-1,n3,n2,n1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), n1 = scn.nextInt(), n2 = scn.nextInt(), n3 = scn.nextInt();
        toh(n,n1,n2,n3);
        scn.close();
    }
    
}
