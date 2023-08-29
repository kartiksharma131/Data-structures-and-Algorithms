package Section2_basicRecursion;

import java.util.Scanner;

public class Ques5_factorialOfN {
	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		int ans = n*factorial(n-1);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = factorial(n);
		System.out.println(ans);

	}

}
