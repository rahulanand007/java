package l004_Recursion;
import java.util.Scanner;

public class PowerLinear {
	
	public static int powerLinear(int x, int n) {
		if(n==0)
			return 1;
		
			int pow = x * powerLinear(x,(n-1));
			return pow;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();	
		System.out.println(powerLinear(x,n));
		scn.close();
	}

}
