package l003_String;
import java.util.Scanner;

public class PalindromicSubstring {
	
	public static void palindromicString(String s1) {
		for(int i=0; i<s1.length();i++) {
			for(int j=i+1;j<=s1.length();j++) {
				if(ispalindrom(s1.substring(i, j))) {
				System.out.println(s1.substring(i, j));
				}
			}
		}
	}
	
	public static boolean ispalindrom(String s1) {
		int i=0, j=s1.length()-1;
		while(i<j) {
			if(s1.charAt(i)!=s1.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		String s1 = scn.nextLine();
		palindromicString(s1);		
	}
}
