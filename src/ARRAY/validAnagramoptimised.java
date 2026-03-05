package ARRAY;

public class validAnagramoptimised {
	public static void main(String[] args) {
		int[] arr=new int[26];
		String s="listen";
		String t="silent";
		
		if(s.length()!=t.length()) {
			System.out.println(false);
			return ;
		}
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'a']++;
			arr[t.charAt(i)-'a']--;
			
		}
		for(int c: arr) {
			if(c!=0) {
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);
	}
	
}
