package section5_Arrays;

import java.util.Scanner;

public class Ques16_MaximumSubarraySum {
	public static int kadane(int [] arr) {
		int currSum=0;
		int maxi = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			currSum=currSum+arr[i];
			if(currSum>maxi) {
				maxi=currSum;
			}
			if(currSum<0) {
				currSum=0;
			}
		}
		return maxi;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = kadane(arr);
		System.out.println(ans);
	}

}
