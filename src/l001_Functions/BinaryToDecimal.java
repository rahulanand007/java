package l001_Functions;

import java.util.Scanner;

public class BinaryToDecimal {
	
	public static int binaryToDecimal(int n){
		int pow =1, ans=0;
		while(n !=0) {
			int rem = n%10;
			n=n/10;
			ans = ans + (rem*pow);
			pow=pow*2;
			
		}
		return ans;
		
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(binaryToDecimal(n));	
		}

}
