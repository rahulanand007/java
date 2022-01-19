package l002_Array;
import java.util.Scanner;
public class SubtractionOfTwoArrays {
	
	public static void subtractionOfTwoArrays(int n1, int n2, int[] arr1, int[] arr2) {  		
		int i = n1-1;
		int j = n2-1;
		int c =0;
		int [] diff = new int[n2];
		int k = diff.length-1;
		while(k>=0) {
			int d =0;
			int arr1v = (i >=0 ? arr1[i]:0);
			if(arr2[j] + c>=arr1v) {
				d= arr2[j] + c - arr1v;
				c=0;
			}else {
				d= 10+arr2[j]+c - arr1v;
				c=-1;	
			}	
			diff[k] = d;
			i--;
			j--;
			k--;		
		}
		int idx=0;
		while(idx<diff.length) {
			if(diff[idx]==0) {
				idx++;
			}else
				break;
		}
		while(idx<diff.length) {
			System.out.println(diff[idx]);
		    idx++;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0; i<n1; i++ )
			arr1[i]= scn.nextInt();
		
		int n2 = scn.nextInt();
		int[] arr2 = new int[n2];
		for(int i=0; i<n2; i++ )
			arr2[i]= scn.nextInt();
		subtractionOfTwoArrays(n1,n2,arr1,arr2);
		
	}

}
