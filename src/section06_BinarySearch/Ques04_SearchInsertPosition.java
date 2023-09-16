package section06_BinarySearch;

import java.util.Scanner;

public class Ques04_SearchInsertPosition {
	public static int insertPosition(int [] arr,int k) {
		int low=0;
		int high=arr.length-1;
		if(k<arr[0]) {
			return 0;
		}
		else if(k>arr[arr.length-1]) {
			return arr.length;
		}
		else {
			while(low<=high) {
				int mid = (low+high)/2;
				if(arr[mid]>=k && arr[mid-1]<k) {
					return mid;
				}
				else if(arr[mid]>k &&arr[mid-1]>k) {
					high=mid-1;
				}
				else {
					low=mid+1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k =scn.nextInt();
		int [] arr = new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = insertPosition(arr,k);
		System.out.println(ans);
	}

}
