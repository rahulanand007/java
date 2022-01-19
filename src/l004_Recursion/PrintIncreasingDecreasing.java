package l004_Recursion;

import java.util.Scanner;

public class PrintIncreasingDecreasing {
	
	public static void printIncreasingDecreasing(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printIncreasingDecreasing(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printIncreasingDecreasing(n);
		scn.close();
	}
}
