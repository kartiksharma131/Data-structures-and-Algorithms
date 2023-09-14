package section7_Strings;

import java.util.HashMap;
import java.util.Scanner;

public class Ques05_IsomorphicStrings {
	public static boolean isIsomorphic(String str1,String str2) {
		HashMap<Character,Character> map = new HashMap<>();
		if(str1.length()!=str2.length()) {
			return false;
		}
		boolean ans=true;
		for(int i=0;i<str1.length();i++) {
			if(map.containsKey(str1.charAt(i))) {
				if(!(str2.charAt(i)==map.get(str1.charAt(i)))) {
					return false;
				}
			}
			else {
				map.put(str1.charAt(i), str2.charAt(i));
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str1=scn.next();
		String str2 = scn.next();
		boolean ans = isIsomorphic(str1,str2);
		if(ans) {
			System.out.println("Isomorphic");
		}
		else {
			System.out.println("Not Isomorphic");
		}

	}

}
