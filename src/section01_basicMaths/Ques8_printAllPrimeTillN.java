package section01_basicMaths;

import java.util.Scanner;

public class Ques8_printAllPrimeTillN {
	public static void printAllPrime(int n) {
		for(int i=2;i<n;i++) {
			int j;
			boolean flag=true;
			for(j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(j);
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printAllPrime(n);

	}

}
