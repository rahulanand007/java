package l001_Functions;
import java.util.Scanner;

public class GcdAndLcm {
	
	public static int gcd(int num1, int num2) {
		for(int i = num2; i>0; i--) {
			if((num1 % i==0) && (num2 % i==0)) 
				return i;
		}
		return 0;		
	}
    public static int lcm(int num1, int num2) {
    	int res = num1 * num2 / gcd(num1,num2);
    	return res;
    }
    public static void main(String[] args) {
    	Scanner scn= new Scanner(System.in);
    	int num1= scn.nextInt(), num2= scn.nextInt();
    	System.out.println(gcd(num1,num2));
    	System.out.println(lcm(num1,num2));
    }
}
