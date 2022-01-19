package l002_Array;
import java.util.Scanner;

public class SpanOfArray {
	
   
	
	public static int maxOfArray(int [] arr, int n) {
		int maxElement = Integer.MIN_VALUE;
		for (int i=0; i<n; i++) {
		maxElement = Math.max(maxElement, arr[i]);			
		}
		return maxElement ;
	}
	
	public static int minOfArray(int [] arr, int n) {
		int minElement = Integer.MAX_VALUE;
		for (int i=0; i<n; i++) {
		minElement = Math.min(minElement, arr[i]);			
		}
		return minElement ;
	}
		
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		
		for(int i=0; i< n; i++) {
			arr[i] = scn.nextInt();
	   }
		int span = maxOfArray(arr,n) - minOfArray(arr,n) ;
        System.out.println(span);
	}	
}

