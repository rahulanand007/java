package l001_Functions;
import java.util.Scanner;

public class RotateNumber {
	
	public static int countOfNumber(int num) {
		int count = 0;
		while(num !=0) {
			num /= 10;
			count++;
		}
		return count;
	}
	
	public static void rotateNumber(int num, int r) {
		int length = countOfNumber(num);
		r = (r % length + length ) % length;
		int a = num % (int)Math.pow(10, r);
		int b = num / (int)Math.pow(10, r);
		
		num = a * (int)Math.pow(10, (length -r)) + b;
		
		System.out.println(num);	
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt(), r = scn.nextInt();
		rotateNumber(num,r);
	}

}
