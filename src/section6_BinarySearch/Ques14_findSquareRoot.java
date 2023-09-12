package section6_BinarySearch;

import java.util.Scanner;

public class Ques14_findSquareRoot {
	public static int squareRoot(int n) {
		int low = 0;
		int high=n/2;
		int ans= 0;
		while(low<=high) {
			int mid=(low+high)/2;
			if(mid*mid==n) {
				return mid;
			}
			else if(mid*mid>n) {
				high=high-1;
			}
			else {
				ans=mid;
				low=mid+1;
			}
		}
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans =squareRoot(n);
		System.out.println(ans);
	}

}
