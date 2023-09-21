package section09_BitManipulation;

import java.util.Scanner;

public class miscQues02_swapTwoNumbers {
	public static void swap(int n,int m) {
		n=n^m;
		m=n^m;
		n=n^m;
		System.out.println(n);
		System.out.println(m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		swap(n,m);
		
	}

}
