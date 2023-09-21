package section09_BitManipulation;

import java.util.Scanner;

public class miscQues04_xorrBetweenARange {
	public static int xorrOfRange(int n,int m) {
		int xorrM = m%4;
		if(xorrM==0) {
			xorrM=m;
		}
		else if(xorrM==1) {
			xorrM=1;
		}
		else if(xorrM==2) {
			xorrM=m+1;
		}
		else {
			xorrM=0;
		}
		int xorrNminus1 = (n-1)%4;
		if(xorrNminus1==1) {
			xorrNminus1=1;
		}
		else if(xorrNminus1==2){
			xorrNminus1=n;
		}
		else {
			xorrNminus1=0;
		}
		return xorrM^xorrNminus1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int ans = xorrOfRange(n,m);
		System.out.println(ans);
	}

}
