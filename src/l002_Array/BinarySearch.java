package l002_Array;

public class BinarySearch {
	
	public static int binarySearch(int [] arr, int x) {
		int low = 0, high = (arr.length-1);
		int mid = (low +high)/2;
		while(low <= high) {
			mid = (low +high)/2;
			if(arr[mid]== x)
				return mid;
		     else if (arr[mid] < x) 
				 low = mid+1; 				 
			 else 
				 high = mid-1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
	
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int x = 12;
		System.out.println(binarySearch(arr,x));
		
	}

}
