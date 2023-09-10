package section6_BinarySearch;

import java.util.Scanner;

public class Ques01_binarySearch {
	public static int binarySearch(int [] arr,int k) {
		int low=0;
		int high=arr.length-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==k) {
				return mid;
			}
			else if(arr[mid]>k) {
				high = mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}
	public static int binarySearchRecursive(int [] arr,int k,int low,int high) {
		if(low>=high) {
			return -1;
		}
		int mid = (low+high)/2;
		if(arr[mid]==k) {
			return mid;
		}
		else if(arr[mid]>k) {
			return binarySearchRecursive(arr, k, low, mid-1);
		}
		else {
			return binarySearchRecursive(arr, k, mid+1, high);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k=scn.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = binarySearchRecursive(arr,k,0,arr.length);
		System.out.println(ans);
	}

}
