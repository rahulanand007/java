package l004_Recursion;
import java.util.Scanner;

public class MaxOfArray{

    public static int maxOfArray(int idx, int[] array){
        if(idx==array.length-1){
            return array[idx];
        }
        
        int maxInSmalerArray = maxOfArray(idx+1, array);
        if(array[idx]>maxInSmalerArray){
            return array[idx];
        }else{
            return maxInSmalerArray;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = scn.nextInt();
        }
        System.out.println(maxOfArray(0, a));  
        scn.close();
    }
}