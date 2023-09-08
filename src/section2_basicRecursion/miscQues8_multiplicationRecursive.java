package section2_basicRecursion;

import java.util.Scanner;

public class miscQues8_multiplicationRecursive {
	public static int multiplyRecursive(int n,int m) {
		if(m==0) {
			return 0;
		}
		int smallAns = n+multiplyRecursive(n, m-1);
		return smallAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m=scn.nextInt();
		int ans = multiplyRecursive(n,m);
		System.out.println(ans);
	}

}
