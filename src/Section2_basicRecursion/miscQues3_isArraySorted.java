package Section2_basicRecursion;

import java.util.Scanner;

public class miscQues3_isArraySorted {
	public static boolean isArraySorted(int arr[]) {
		if(arr.length<=1) {
			return true;
		}
		int smallInput[]=new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallInput[i-1]=arr[i];
		}
		
		boolean smallAns = isArraySorted(smallInput);
		if(!smallAns) {
			return false;
		}
		if(arr[0]<=arr[1]) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isArraySorted2(int arr[]) {
		if(arr.length<=1) {
			return true;
		}
		if(arr[0]>arr[1]) {
			return false;
		}
		else {
			int[] smallInput = new int[arr.length-1];
			for(int i=1;i<arr.length;i++) {
				smallInput[i-1]=arr[i];
			}
			boolean smallAns = isArraySorted2(smallInput);
			if(smallAns) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		boolean ans = isArraySorted2(arr);
		if(ans) {
			System.out.println("sorted");
		}
		else {
			System.out.println("not sorted");
		}
	}

}
