package l002_Array;

import java.util.Scanner;

public class MatrixMultiplication {
	
	public static void matrixMultiplication(int n1, int m1,int n2, int m2, int[][] arr1, int[][] arr2) {
	    if(m1!=n2) {
	    	System.out.println("Invalid Input");
	    	return;
	    }
		int[][] product = new int[n1][m2];
		for(int i=0; i<n1; i++) {
			for(int j=0; j<m2; j++) {
				for(int k=0; k<n2;k++) {
					product[i][j] = product[i][j]+(arr1[i][k]*arr2[k][j]);
				}
			}
		}
		for(int i=0; i<n1;i++) {
			for(int j=0;j<m2; j++) {
				System.out.print(product[i][j]+ " ");
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt(), m1 = scn.nextInt();
		int [][] arr1 = new int[n1][m1];
		for(int i=0; i<n1; i++) {
			for(int j=0; j<m1; j++)
				arr1[i][j]= scn.nextInt();
		}
		
		int n2 = scn.nextInt(), m2 = scn.nextInt();
		int [][] arr2 = new int[n2][m2];
		for(int i=0; i<n2; i++) {
			for(int j=0; j<m2; j++)
				arr2[i][j]= scn.nextInt();
		}
		matrixMultiplication(n1,m1,n2,m2,arr1,arr2);
	}
}
