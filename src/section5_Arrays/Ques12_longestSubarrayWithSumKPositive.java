package section5_Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class Ques12_longestSubarrayWithSumKPositive {
	public static int longestSubarraySum(int []arr,int k) {
		int i=0;
		int j=0;
		int maxLen=0;
		int sum=arr[i];
		while(i<=j&&j<arr.length) {
			
			while(sum>k) {
				sum-=arr[i];
				i++;
			}
			if(sum==k) {
				maxLen=Math.max(maxLen, j-i+1);
			}
			j++;
			if(j<arr.length) {
				sum+=arr[j];
			}
		}
		return maxLen;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = longestSubarraySum(arr,k);
		System.out.println(ans);
	}

}
