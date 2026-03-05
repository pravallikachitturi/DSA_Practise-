package ARRAY;

import java.util.Arrays;

public class validAnagram {
		public static void main(String[] args) {
			String str1="silent";
			String str2="listen";
			char[] chars=str1.toCharArray();
			char[] chars2=str2.toCharArray();
			Arrays.sort(chars2);
			Arrays.sort(chars);
			String sorted=new String(chars);
			String sorted2=new String(chars2);
			System.out.println(sorted);
			System.out.println(sorted2);
			System.out.println(sorted.equals(sorted2));
			
		}
}
