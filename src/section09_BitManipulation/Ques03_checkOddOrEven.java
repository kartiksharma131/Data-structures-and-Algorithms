package section09_BitManipulation;

import java.util.Scanner;

public class Ques03_checkOddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans= n&1;
		if(ans==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
