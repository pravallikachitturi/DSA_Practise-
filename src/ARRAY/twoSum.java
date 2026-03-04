package ARRAY;

import java.util.Arrays;

public class twoSum {
	public static void main(String args[]) {
		int arr[]= {2,7,11,15};
		int target=9;
		int[] arr1=new int[2];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
						arr1[0]=i;
						arr1[1]=j;

				}
			}
	}
		System.out.println(Arrays.toString(arr1));
	} 
	}

