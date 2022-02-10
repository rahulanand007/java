package l004_Recursion;
import java.util.Scanner;

public class AllIndecesOfArray {

    public static int[] allIndecesOfArray(int idx,int fsf, int x, int[] array) {
        if(idx == array.length){
            return new int[fsf];
        }
            int[] arrayNew;
        if(array[idx] == x){
             arrayNew = allIndecesOfArray(idx+1, fsf+1, x, array);
             arrayNew[fsf] = idx;
        }else{
            arrayNew = allIndecesOfArray(idx+1, fsf, x, array);
        }
        return arrayNew;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int[] arrayNew = allIndecesOfArray(0,0, x, a);
        if(arrayNew.length == 0){
            System.out.println();
            scn.close();
            return;
        }
        for(int j=0;j<arrayNew.length ; j++ ){
            System.out.println(arrayNew[j]);
        }
        
        scn.close();
    }
    
}
