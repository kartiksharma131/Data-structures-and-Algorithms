package section01_basicMaths;

import java.util.Scanner;

public class Ques7_checkForPrime {
	public static boolean checkForPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		boolean ans = checkForPrime(n);
		if(ans) {
			System.out.println("prime ");
		}
		else {
			System.out.println("not prime");
		}
	}

}
