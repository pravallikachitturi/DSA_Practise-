package ARRAY;
import java.util.*;
public class hashTwoSum {
	public static void main(String[] args) {
	int target=9;
	int arr[]= {2,7,11,52};
	HashMap<Integer,Integer> map=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		int complement=target-arr[i];
		if(map.containsKey(complement)) {
			int[] result= {map.get(complement),i};
			System.out.println(Arrays.toString(result));
		}
		map.put(arr[i],i);
	}
	}
}
