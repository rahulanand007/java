package l004_Recursion;

import java.util.Scanner;

public class PrintStairPaths {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt();
        printStairPaths(n,"");
        scn.close();
    }

    public static void printStairPaths(int n, String paths) {
        if(n==0){
            System.out.println(paths);
            return;
        }else if(n<0){
            return;
        }
        printStairPaths(n-1, paths+'1');
        printStairPaths(n-2, paths+'2');
        printStairPaths(n-3, paths+'3');
    }
    
}
