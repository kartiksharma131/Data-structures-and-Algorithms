package section01_basicMaths;

import java.util.Scanner;

public class Ques3_checkPallindrome {
	public static int reverse(int n) {
		int ans = 0;
		while(n>0) {
			ans = (ans*10)+(n%10);
			n=n/10;
		}
		return ans;
	}
	public static boolean checkPallindrome(int n) {
		int ans = reverse(n);
		if(ans==n) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		boolean ans = checkPallindrome(n);
		if(ans) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("not a pallindrome");
		}

	}

}
