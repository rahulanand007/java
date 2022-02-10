package l004_Recursion;
import java.util.Scanner;


public class LastIndex {

    public static int lastIndex(int idx, int x, int[] array) {
        if(idx == array.length){
            return -1;
        }
        int li = lastIndex(idx+1, x, array);
        if(li==-1){
            if(array[idx]== x){
                return idx;
            }else{
                return -1;
            }
        }else{
            return li;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int index =lastIndex(0, x, a);
        System.out.println(index);
        scn.close();
    }
    
}
