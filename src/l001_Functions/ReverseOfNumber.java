package l001_Functions;
import java.util.Scanner;

public class ReverseOfNumber {
	
	public static void printInReverse(int num) {
		int lastDigit;
		while(num !=0) {
			lastDigit = (num%10);
			num = num/10;
			System.out.println(lastDigit);
		}
			
		
	}
    public static void main(String[] args) {
    	Scanner scn= new Scanner(System.in);
    	int num= scn.nextInt();
    	printInReverse(num);
    }
}
