package l003_String;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAllPrime {
	
	public static boolean isPrime(int n) {
		for(int i=2; i*i<=n;i++) {
			if(n%i == 0) {
				return false;
			}
		}return true;		
	}
	
	public static void removeAllPrime(ArrayList<Integer> list) {
		for(int i=list.size()-1; i>=0 ;i--) {
			if(isPrime(list.get(i))) {
				list.remove(i);
			}
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			list.add(scn.nextInt());
		}
		removeAllPrime(list);
		scn.close();
	}
}
