package l001_Functions;

import java.util.Scanner;

public class BinaryToAnyBase {

	public static int binaryToAnyBase(int n, int b){
		int pow =1, ans=0;
		while(n !=0) {
			int rem = n%b;
			n=n/b;
			ans = ans + (rem*pow);
			pow=pow*2;
			
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(), b = scn.nextInt();
		System.out.println(binaryToAnyBase(n,b));
	
		}
}
