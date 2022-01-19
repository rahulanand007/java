package l002_Array;

import java.util.Scanner;

public class SpiralDisplay {
	
	public static void spiralDisplay(int n, int m, int[][] arr ) {
		int minrow=0;
		int maxrow= arr.length-1;
		int mincolumn = 0;
		int maxcolumn = arr[0].length-1;
		int tne = n*m;  //total no of elements
		int count = 0;
		
		while(count<tne) {
			//Left wall
			if(count<tne) {
		    for(int i =minrow; i<=maxrow;i++) {
		    	System.out.println(arr[i][mincolumn]);
		    	count++;
		    	}
			}
		    mincolumn++;
		    //Bottom wall
		    if(count<tne) {
		    for(int j=mincolumn; j<=maxcolumn;j++) {
		    	System.out.println(arr[maxrow][j]);
		    	count++;
		    	}
		    }
		    maxrow--;
			//Right wall
		    if(count<tne) {
		    for(int i=maxrow; i>=minrow; i--) {
		    	System.out.println(arr[i][maxcolumn]);
		    	count++;
		    	}
		    }
		    maxcolumn--;
		    //Top Wall
		    if(count<tne) {
		    for(int j=maxcolumn; j>=mincolumn;j--) {
		    	System.out.println(arr[minrow][j]);
		    	count++;
		    	}
		    }
		    minrow++;		
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
		spiralDisplay(n,m,arr);
	}  
}
