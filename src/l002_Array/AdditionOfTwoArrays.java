package l002_Array;
import java.util.Scanner;
public class AdditionOfTwoArrays {
	
	public static void additionOfTwoArrays(int[] arr1,int[] arr2,int n1,int n2){
			int[] sum = new int[n1>n2? n1:n2];
			int i = n1-1;
			int j = n2-1;
			int k= sum.length -1;
			int c=0;
			while(i>=0 || j>=0) {
				int s= c;
				if(i>=0)
					s=s+arr1[i];
				if(j>=0)
					s=s+arr2[j];
				c=s/10;
				sum[k]=s%10;
				i--;
				j--;
				k--;	
			}
			if(c>0)
				System.out.println(c);
			for(int p =0; p<sum.length; p++ )
				System.out.println(sum[p]);	
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int [] arr1 = new int[n1];
		for(int i=0; i<n1; i++)
			arr1[i]=scn.nextInt();
		
		int n2 = scn.nextInt();
		int [] arr2 = new int[n2];
		for(int i=0; i<n2; i++)
			arr2[i]=scn.nextInt();
		additionOfTwoArrays(arr1,arr2,n1,n2);
	}

}
