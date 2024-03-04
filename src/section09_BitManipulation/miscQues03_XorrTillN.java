 package section09_BitManipulation;

import java.util.Scanner;

public class miscQues03_XorrTillN {
	public static int xorrTillN(int n) {
		int rem = n%4;
		if(rem==0) {
			return n;
		}
		else if(rem==1){
			return 1;
		}
		else if(rem==2) {
			return n+1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = xorrTillN(n);
		System.out.println(ans);
	}

}
