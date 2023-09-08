package section2_basicRecursion;

import java.util.Scanner;

public class Ques2_print1toN {
	public static void print1ToN(int n) {
		if(n==0) {
			return;
		}
		print1ToN(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		print1ToN(n);
	}

}
