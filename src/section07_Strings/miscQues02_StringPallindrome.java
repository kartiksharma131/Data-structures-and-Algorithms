package section07_Strings;

import java.util.Scanner;

public class miscQues02_StringPallindrome {
	public static boolean stringPallindrome(String str) {
		int i=0;
		int j = str.length()-1;
		boolean ans=true;
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j)) {
				ans =false;
				break;
			}
			i++;
			j--;
				
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		boolean ans = stringPallindrome(str);
		if(ans) {
			System.out.println("String is pallindrome");
		}
		else {
			System.out.println("not a pallindrome");
		}
	}

}
