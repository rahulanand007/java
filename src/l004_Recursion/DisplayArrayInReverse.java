package l004_Recursion;
import java.util.Scanner;

public class DisplayArrayInReverse {

    public static void displayArrayInReverse(int n,int[] array) {
        if(n == 0){
            return;
        }
        System.out.println(array[n-1]);
        displayArrayInReverse(n-1, array);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = scn.nextInt();
        }
        
        displayArrayInReverse(n, a);
        scn.close();
    }
    
}
