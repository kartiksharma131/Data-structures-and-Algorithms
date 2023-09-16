package section06_BinarySearch;

import java.util.Scanner;

public class Ques15_NthRootOfNumber {
	public static int product(int a,int m) {
		int ans=1;
		while(m>0) {
			ans = ans*a;
			m--;
		}
		return ans;
	}
	public static int nthRoot(int n,int m) {
		int low=0;
		int high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(product(mid,m)==n) {
				return mid;
			}
			else if(product(mid,m)>n) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int ans= nthRoot(n,m);
		System.out.println(ans);
	}

}
