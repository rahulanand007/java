package l001_Functions;
import java.util.Scanner;

public class InverseOfNumber {
	
	public static void inverseOfNumber(int num) {
		int index = 1;
		int result = 0;
		int lastDigit= 0;
		while (num != 0) {
		lastDigit = num % 10;
		result = result + (index * (int)Math.pow(10, lastDigit - 1));
		num=num/10;
		index++ ;
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		inverseOfNumber(num);
	}

}
