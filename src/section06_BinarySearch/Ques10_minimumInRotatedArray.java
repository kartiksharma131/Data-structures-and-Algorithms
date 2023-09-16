package section06_BinarySearch;

import java.util.Scanner;

public class Ques10_minimumInRotatedArray {
	public static int pivot(int [] arr) {
		int low=0;
		int high=arr.length-1;
		while(low<high) {
			int mid=(low+high)/2;
			if(arr[mid]>arr[0]) {
				low=mid+1;
			}
			else {
				high=mid;
			}
		}
		return low;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int peak = pivot(arr);
		int ans = arr[peak];
		System.out.println(ans);
				
	}

}
