package ARRAY;

import java.util.Arrays;

public class sorting {
		public static void main(String[] args) {
			int arr[]= {1,1,2,2,3};
		//	int[] dup= {};
			
			int i=0;
			for(int j=1;j<arr.length;j++) {
				if(arr[i]!=arr[j]) {
					i++;
					arr[i]=arr[j];
				}
					}
			int[] result=Arrays.copyOf(arr, i+1);
			System.out.println(Arrays.toString(result));
				}
			}
		

