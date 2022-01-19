package l002_Array;

import java.util.Scanner;

public class StateOfWakanda_1 {
	
	public static void stateOfWakanda(int n, int m, int[][] arr) {
		for(int j=0; j<arr[0].length;j++) {
			if(j%2==0) {
				for(int i=0; i<arr.length; i++) 
					System.out.println(arr[i][j]);
		}else {
			for(int i= arr.length-1; i>=0;i--)
				System.out.println(arr[i][j]);		
		}
	}
	}	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(), m =scn.nextInt();
		int[][] arr = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]= scn.nextInt();
			}
		}
		stateOfWakanda(n,m,arr);
	}

}
