package section02_basicRecursion;

import java.util.Scanner;

public class miscQues1_powerOfX {
	public static int power(int x,int n) {
		if(n==0) {
			return 1;
		}
		int ans = x*power(x,n-1);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x= scn.nextInt();
		int n = scn.nextInt();
		int ans = power(x,n);
		System.out.println(ans);
	}

}
