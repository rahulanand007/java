package l003_String;

import java.util.Scanner;

public class PermutationsOfString {
	
	public static void permutationsOfString(String str) {
		int len = str.length();
		int total = factorial(str);
		for(int i=0;i<total ;i++) {
			StringBuilder sb = new StringBuilder(str);
			int temp = i;
			for(int j =len; j>0 ; j--) {
				int q = temp / j;
				int r = temp % j;
				System.out.print(sb.charAt(r));
				sb.deleteCharAt(r);
				temp = q;
			}
			System.out.println();
		}
		
	}
	
	public static int factorial(String str) {
		int factorial = 1;
		for(int i=2; i<=str.length(); i++) {
			factorial *= i; 
		}return factorial;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		permutationsOfString(str);
		scn.close();
	}

}
