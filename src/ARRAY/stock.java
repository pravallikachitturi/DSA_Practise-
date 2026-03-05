package ARRAY;

public class stock {
		public static void main(String[] args) {
			int arr[]= {7,1,5,3,6,4};
			int[] arr1= {};
			int maxprofit=0;
			for(int i=0;i<arr.length;i++) {
		       for(int j=i+1;j<arr.length;j++) {
					int profit=arr[j]-arr[i];
					if(profit>maxprofit) {
						maxprofit=profit;
					}
					}
				
			}
			System.out.println(maxprofit);
		}
}
