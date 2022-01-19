package l004_Recursion;
import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int n) {
		if(n==0)
			return 1;
		int fact = 0;
			fact += n * factorial(n-1);
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(factorial(n));
		scn.close();
	}

}
