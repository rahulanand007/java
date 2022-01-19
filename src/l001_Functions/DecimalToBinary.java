package l001_Functions;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static int decimalToBinary(int n){
		int pow =1, ans=0;
		while(n !=0) {
			int rem = n%2;
			n=n/2;
			ans = ans + (rem*pow);
			pow=pow*10;
			
		}
		return ans;
		
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(decimalToBinary(n));	
		}
}
