package section15_slidingWindow;

import java.util.HashMap;
import java.util.Scanner;

public class Ques01_LongestSubstringWithoutRepeatingCharacters {

	public static int longestSubstringWithoutRepeatingCharacters(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int left=0;
		int right=0;
		int n = s.length();
		int len =0;
		while(right<n) {
			if(map.containsKey(s.charAt(right))) {
				left = Math.max(map.get(s.charAt(right))+1, left);
			}
			map.put(s.charAt(right), right);
			len = Math.max(len, right-left+1);
			right++;
			
		}
		return len;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		int ans = longestSubstringWithoutRepeatingCharacters(s);
		System.out.println(ans);

	}

}
