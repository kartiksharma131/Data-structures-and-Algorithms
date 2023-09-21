package section09_BitManipulation;

import java.util.Scanner;

public class Ques06_setTheRightmostUnsetBit {
	public static int setRightmost(int n) {
		int mask=1;
		boolean ans=true;
		while(ans) {
			if((n&mask)==0) {
				return (n|mask);
			}
			else {
				mask=mask<<1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = setRightmost(n);
		System.out.println(ans);
	}

}
