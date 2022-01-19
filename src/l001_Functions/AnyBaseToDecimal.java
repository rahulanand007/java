package l001_Functions;

import java.util.Scanner;

public class AnyBaseToDecimal {
	public static int anybaseToDecimal(int n, int b){
		int pow =1, ans=0;
		while(n !=0) {
			int rem = n%10;
			n=n/10;
			ans = ans + (rem*pow);
			pow=pow*b;
			
		}
		return ans;
		
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(), b = scn.nextInt();
		System.out.println(anybaseToDecimal(n,b));	
		}

}
