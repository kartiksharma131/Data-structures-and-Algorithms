package section04_Sorting;

import java.util.Scanner;

public class Ques2_BinarySearch {

	public static int binarySearch(int [] arr,int key) {
		int start=0;
		int end= arr.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]>key) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}
	public static int binarySearchRecursive(int [] arr,int key, int start,int end) {
		if(start>end) {
			return -1;
		}
		int mid = (start+end)/2;
		if(arr[mid]==key) {
			return mid;
		}
		else if(arr[mid]>key) {
			return binarySearchRecursive(arr, key, start, mid-1);
		}
		else {
			return binarySearchRecursive(arr, key, mid+1, end);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = binarySearch(arr,k);
		int ansRecursive = binarySearchRecursive(arr,k,0,arr.length-1);
		System.out.println(ans);
		System.out.println(ansRecursive);
	}

}
