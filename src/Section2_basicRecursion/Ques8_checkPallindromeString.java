package Section2_basicRecursion;

import java.util.Scanner;

public class Ques8_checkPallindromeString {
	public static boolean checkPallindrome(String str,int start,int end) {
		if(start>=end) {
			return true;
		}
		if(str.charAt(start)!=str.charAt(end)) {
			return false;
		}
		boolean smallAns = checkPallindrome(str, start+1, end-1);
		return smallAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str= scn.nextLine();
		boolean ans = checkPallindrome(str,0,str.length()-1);
		if(ans) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("not pallindrome");
		}
	}

}
