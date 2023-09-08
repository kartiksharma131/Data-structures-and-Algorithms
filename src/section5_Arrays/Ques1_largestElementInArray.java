package section5_Arrays;

import java.util.Scanner;

public class Ques1_largestElementInArray {
	public static int largestElement(int [] arr) {
		int ans = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>ans) {
				ans=arr[i];
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = largestElement(arr);
		System.out.println(ans);
	}

}
