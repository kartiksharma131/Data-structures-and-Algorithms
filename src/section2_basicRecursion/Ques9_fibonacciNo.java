package section2_basicRecursion;

import java.util.Scanner;

public class Ques9_fibonacciNo {
	public static int fibonacci(int n) {
		if(n==0||n==-1) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		int ans = fibonacci(n-1)+fibonacci(n-2); 
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int n = scn.nextInt();
		int ans = fibonacci(n);
		System.out.println(ans);
	}

}
