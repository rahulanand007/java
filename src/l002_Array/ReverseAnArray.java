package l002_Array;

import java.util.Scanner;

public class ReverseAnArray {

	public static void reverseAnArray(int[] arr1){
		int i=0, j= arr1.length-1;
		while(i<j) {
			int temp = arr1[i];
			arr1[i]=arr1[j];
			arr1[j]=temp;
			i++;
			j--;
		}
		for(int p=0;p< arr1.length;p++)
			System.out.println(arr1[p]);
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0; i<n1; i++ )
			arr1[i]= scn.nextInt();
		reverseAnArray(arr1);
	}	
}
