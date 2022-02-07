package l004_Recursion;
import java.util.Scanner;

public class DisplayArray {

    public static void displayArray(int idx,int[] array) {
        if(idx == array.length){
            return;
        }
        System.out.println(array[idx]);
        displayArray(idx+1, array);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = scn.nextInt();
        }
        
        displayArray(0, a);
        scn.close();
    }
}
