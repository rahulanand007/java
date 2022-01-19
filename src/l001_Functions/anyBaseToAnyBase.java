package l001_Functions;

import java.util.Scanner;

public class anyBaseToAnyBase {	
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
	
	public static int decimalToAnybase(int dec, int c){
		int pow =1, ans=0;
		while(dec !=0) {
			int rem = dec%c;
			dec=dec/c;
			ans = ans + (rem*pow);
			pow=pow*10;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(), b = scn.nextInt(), c = scn.nextInt();
		int dec = anybaseToDecimal(n,b);
		System.out.println(decimalToAnybase(dec,c));
			
		}
}
