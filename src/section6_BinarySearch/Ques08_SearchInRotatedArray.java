package section6_BinarySearch;

import java.util.Scanner;

public class Ques08_SearchInRotatedArray {
	
	public static boolean binarySearch(int [] arr,int k,int start,int end) {
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==k) {
				return true;
			}
			else if(arr[mid]>k) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return false;
	}
	public static int pivot(int [] arr) {
		int low=0;
		int high=arr.length-1;
		while(low<high) {
			int mid=(low+high)/2;
			if(arr[mid]>arr[mid-1]) {
				low=mid+1;
			}
			else {
				high=mid;
			}
		}
		return low;
	}
	public static boolean searchInRotated(int [] arr,int k) {
		int peakIndex = pivot(arr);
		boolean ans1 = binarySearch(arr, k, 0, peakIndex);
		boolean ans2 = binarySearch(arr, k, peakIndex+1, arr.length-1);
		if(ans1 || ans2) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k= scn.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		boolean ans = searchInRotated(arr,k);
		if(ans) {
			System.out.println("element present");
		}
		else {
			System.out.println("not present");
		}
	}

}
