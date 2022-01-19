package l001_Functions;
import java.util.Scanner;
public class functions {

	public static Scanner scn = new Scanner(System.in); 
	
	//no R no A 
	public static void printMessage() {
		System.out.println("Hello My code");
	}	
	//2nd example
	public static void printFifteen() {
		System.out.println(5+10);
	}
	
	
	//only R no A
	public static int sumOfTwoNumbers() {
		int a = scn.nextInt(), b = scn.nextInt();
		return (a+b);
	}
	//2nd example
	public static int multipleOfTwoNumbers() {
		int a = scn.nextInt(), b = scn.nextInt();
		return (a*b);
	}
		
	
	
	//only A no R
	public static void printTable(int num) {
		for(int i=1; i<=10; i++) {
			System.out.println(num + "X" + i + "=" + num*i);
		}
	}
	//2nd example 
	public static void printSquare(int num) {
		System.out.println(num*num);
		
	}
	
	public static void main(String[] args) {
		
	}
	
	
	
	
	
	
	
	
}
