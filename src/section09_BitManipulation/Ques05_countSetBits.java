package section09_BitManipulation;

import java.util.Scanner;

public class Ques05_countSetBits {
	public static int countSetBits(int n) {
		int ans = 0;
		int temp;
		while(n>0) {
			temp=n;
			if((temp&1)==1) {
				ans+=1;
			}
			n=n>>1;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int ans = countSetBits(n);
		System.out.println(ans);
	}

}
