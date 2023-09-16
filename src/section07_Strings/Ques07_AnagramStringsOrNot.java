package section07_Strings;

import java.util.Scanner;

public class Ques07_AnagramStringsOrNot {
	public static boolean areStringsAnagram(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		long ascii1=0;
		long ascii2=0;
		for(int i=0;i<str1.length();i++) {
			ascii1 +=(int)str1.charAt(i);
			ascii2 +=(int)str2.charAt(i);
		}
		if(ascii1==ascii2) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str1 = scn.next();
		String str2 = scn.next();
		boolean ans = areStringsAnagram(str1,str2);
		if(ans) {
			System.out.println("anagrams");
		}
		else {
			System.out.println("Not anagrams");
		}
				
	}

}
