package section05_Arrays;

import java.util.Scanner;

public class Ques17_PrintSubarrayWithMaxSum {

	public static void kadane(int [] arr) {
		int currSum=0;
		int maxi = Integer.MIN_VALUE;
		int start=0;
		int ansStart=-1;
		int ansEnd=-1;
		for(int i=0;i<arr.length;i++) {
			if(currSum==0) {
				start=i;
			}
			currSum=currSum+arr[i];
			if(currSum>maxi) {
				maxi=currSum;
				ansStart=start;
				ansEnd=i;
			}
			if(currSum<0) {
				currSum=0;
			}
		}
		for(int i=ansStart;i<=ansEnd;i++) {
			System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		kadane(arr);
		
	}

}
