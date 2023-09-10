package section6_BinarySearch;

import java.util.Scanner;

public class Ques13_PeakElement {
	public static int peakElement(int [] arr) {
		int low=0;
		int high=arr.length-1;
		while(low<high) {
			int mid=(low+high)/2;
			if(arr[mid]<arr[mid+1]) {
				low=mid+1;
			}
			else{
				high=mid;
			}
			
		}
		return arr[low];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = peakElement(arr);
		System.out.println(ans);
	}

}
