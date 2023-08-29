package Section2_basicRecursion;

import java.util.Scanner;

public class Ques4_SumOfFirstN {
	public static int sumOfFirstN(int n) {
		if(n==0) {
			return 0;
		}
		int sum= n+ sumOfFirstN(n-1);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = sumOfFirstN(n);
		System.out.println(ans);
	}

}
