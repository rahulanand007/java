package l003_String;
import java.util.Scanner;

public class StringCompression {
	public static String compression1(String s1) {
		String str = "";
		for(int i=0; i<s1.length();i++) {
			if(i==0) {
				str = str + s1.charAt(i);
			}else if(s1.charAt(i-1)!=s1.charAt(i)) {
				str = str + s1.charAt(i);
			}
		}return str;
	}
	
	public static String compression2(String s1) {
		String str="";
		for(int i=0; i<s1.length();i++) {
			int count=1;
			while(i<s1.length()-1 && s1.charAt(i)==s1.charAt(i+1)) {
				count++;
				i++;
			}
			str += s1.charAt(i);
			if(count>1)
				str += count;
		}return str;

	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		System.out.println(compression1(s1));
		System.out.println(compression2(s1));
		
	}

}
