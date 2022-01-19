package l002_Array;
import java.util.Scanner;
public class BarChart {
	
	public static void printBarChart(int[] arr1) {
		int max = arr1[0];
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]> max)
			max = arr1[i];
		}
		for(int floor=max; floor>=1; floor--) {
			for(int i=0; i<arr1.length;i++) {
				if(arr1[i]>=floor)
					System.out.print("*\t");
					else System.out.print("\t");	
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		
		int [] arr1 = new int[n];
		for(int i=0; i<n; i++)
			arr1[i]= scn.nextInt();
		printBarChart(arr1);
		
	}
}
