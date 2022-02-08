package l004_Recursion;
import java.util.Scanner;

public class FirstIndex {

    public static int firstIndex(int idx,int x, int[] array){
        if(idx == array.length){
            return -1;
        }
        if(x == array[idx]){
            return idx;
        }
        int fi = firstIndex(idx+1, x, array);
        return fi;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int index =firstIndex(0, x, a);
        System.out.println(index);
        scn.close();
    }
}
