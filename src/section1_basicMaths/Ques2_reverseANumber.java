package section1_basicMaths;

import java.util.Scanner;

public class Ques2_reverseANumber {

	public static int reverse(int n) {
		int ans = 0;
		while(n>0) {
			ans=ans*10 +(n%10);
			n=n/10;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans=reverse(n);
		System.out.println(ans);
	}

}
