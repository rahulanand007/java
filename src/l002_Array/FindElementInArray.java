package l002_Array;
import java.util.Scanner;
public class FindElementInArray {
	public static Scanner scn = new Scanner(System.in);
	
	public static void takeArrayInput(int n, int [] arr1) {
		for(int i=0; i<n; i++)
			arr1[i] = scn.nextInt();
	}
	
	public static int findElementInArray(int d, int n, int [] arr1) {
		for(int i=0; i<n; i++) {
			if(arr1[i]==d)
				return i;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int n =scn.nextInt();
		int [] arr1 = new int[n];
		takeArrayInput(n,arr1);
		int d = scn.nextInt();
		System.out.println(findElementInArray(d,n,arr1));
		
	}

}
