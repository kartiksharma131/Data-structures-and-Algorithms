package section5_Arrays;

import java.util.Scanner;

public class Ques09_findMissingNumber {
	public static int missingNo(int [] arr, int N) {
		int sumTillN = (N*(N+1))/2;
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		int ans = sumTillN-sum;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int N = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = missingNo(arr,N);
		System.out.println(ans);
	}

}
