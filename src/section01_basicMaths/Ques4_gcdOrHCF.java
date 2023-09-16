package section01_basicMaths;

import java.util.Scanner;

public class Ques4_gcdOrHCF {
	public static int HCF(int m,int n) {
		int ans=1;
		int low=0;
		if(m>n) {
			low=n;
		}
		else {
			low=m;
		}
		for(int i=ans;i<=low;i++) {
			if(m%i==0 &&n%i==0) {
				ans=i;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n=scn.nextInt();
		int ans = HCF(m,n);
		System.out.println(ans);
	}

}
