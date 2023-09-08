package section2_basicRecursion;

import java.util.Scanner;

public class miscQues2_numberOfDigits {
	public static int noOfDigits(int n) {
		if(n==0) {
			return 0;
		}
		int ans = 1+noOfDigits(n/10);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int ans = noOfDigits(n);
		System.out.println(ans);
	}

}
