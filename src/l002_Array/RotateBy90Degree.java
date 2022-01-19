package l002_Array;

import java.util.Scanner;

public class RotateBy90Degree {
	
	public static void rotateBy90Degree(int[][] arr) {
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<i; j++) {
				int temp =arr[i][j] ;
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		for(int i=0; i<arr.length;i++) {
			int left = 0;
		    int right =arr[0].length-1;
		    while(left<right) {
		    	int temp= arr[i][left];
		    	arr[i][left]= arr[i][right];
		    	arr[i][right]= temp;
		    	left++;
		    	right--;
		    }
		}
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]= scn.nextInt();
			}
		}
		rotateBy90Degree(arr);
	}  

}
