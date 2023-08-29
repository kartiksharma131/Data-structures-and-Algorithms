package section1_basicMaths;

import java.util.Scanner;

public class Ques6_printAllDivisors {
	public static void printAllDivisors(int n) {
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printAllDivisors(n);

	}

}
