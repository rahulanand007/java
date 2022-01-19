package l001_Functions;
import java.util.Scanner;

public class digitsOfNumber {
	
	public static int countDigitsOfNumber(int num) {
		int count = 0;
		while(num != 0) {
			num=(num/10);
			count++;
		}
		return count;
	}
	
	public static void printDigitsOfNumber(int num) {
		int count = countDigitsOfNumber(num)- 1;
		while (count >= 0) {
		int	digit = num /(int) Math.pow(10, count) ;
		num = num % (int) Math.pow(10, count);
		count--;
		System.out.println(digit);
		}
			
	}
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		int num= scn.nextInt();
		printDigitsOfNumber(num);
		
	}

}
