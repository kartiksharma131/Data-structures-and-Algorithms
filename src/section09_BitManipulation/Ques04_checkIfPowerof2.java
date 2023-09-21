package section09_BitManipulation;

import java.util.Scanner;

public class Ques04_checkIfPowerof2 {
	public static boolean isPowerOf2(int n) {
		int ans;
		while(n>0) {
			ans=n&1;
			if(n>1&&ans==1  ) {
				return false;
			}
			else if(ans==1 && n==1) {
				return true;
			}
			else {
				n=n>>1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		boolean ans = isPowerOf2(n);
		System.out.println(ans);
	}

}
