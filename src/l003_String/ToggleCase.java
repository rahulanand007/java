package l003_String;

import java.util.Scanner;

public class ToggleCase {
	public static String toggleCase(String str) {
		StringBuilder sb = new StringBuilder(str);
		for(int i=0;i<sb.length();i++) {
			char ch = sb.charAt(i);
			if(ch>='a' && ch<='z' ) {
				ch = (char)('A' + ch-'a');
				sb.setCharAt(i, ch);
			}else {
				ch =(char)('a' + ch -'A');
				sb.setCharAt(i, ch);
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
