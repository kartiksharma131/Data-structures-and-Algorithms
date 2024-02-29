package section06_BinarySearch;

import java.util.Scanner;

public class Ques17_findPivotElement {

	public static int pivot(int [] arr) {
		int start=0;
		int end= arr.length-1;
		int mid = start +(end-start)/2;
		while(start<end) {
			if(arr[mid]<arr[mid+1]) {
				start=mid+1;
			}
			else {
				end=mid;
			}
			mid = start +(end-start)/2;
		}
		return mid;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = pivot(arr);
		System.out.println(ans);
	}

}
