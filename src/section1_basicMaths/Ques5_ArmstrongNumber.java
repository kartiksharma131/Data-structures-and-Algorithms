package section1_basicMaths;

import java.util.Scanner;

public class Ques5_ArmstrongNumber {
	public static boolean isArmstrong(int n) {
		int ans =0;
		int k=n;
		while(k>0) {
			int rem = k%10;
			ans = ans+(rem*rem*rem);
			k=k/10;
		}
		if(ans==n) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		boolean ans = isArmstrong(n);
		if(ans) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not armstrong");
		}
	}

}
