package section02_basicRecursion;

import java.util.Scanner;

public class Ques3_printNto1 {
	public static void printNto1(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printNto1(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printNto1(n);
	}

}
