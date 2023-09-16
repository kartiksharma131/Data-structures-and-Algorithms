package section01_basicMaths;

import java.util.Scanner;

public class Ques1_countDigits {

	public static int countDigits(int n) {
		int ans =0;
		while(n>0) {
			n=n/10;
			ans++;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = countDigits(n);
		System.out.println(ans);

	}

}
