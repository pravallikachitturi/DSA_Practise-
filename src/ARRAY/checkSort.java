package ARRAY;

public class checkSort {
	public static void main(String[] args) {
		int arr[]= {2,34,5,6,1};
		boolean issort=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[i+1]) {
				issort=false;
				break;
			}
			
		}
		if(issort) {
			System.out.println("sorted");
		}
		else {
			System.out.println("not sorted");
		}
	}
}
