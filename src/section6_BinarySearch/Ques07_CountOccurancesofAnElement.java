package section6_BinarySearch;

import java.util.Scanner;

public class Ques07_CountOccurancesofAnElement {
	public static int lastOccurance(int [] arr,int k) {
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==k) {
				ans=mid;
				low=mid+1;
			}
			else if(arr[mid]>k) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return ans;
	}
	public static int firstOccurance(int [] arr,int k) {
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==k) {
				ans=mid;
				high=mid-1;
			}
			else if(arr[mid]>k) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return ans;
	}
	public static int countOccurances(int [] arr,int k) {
		return (lastOccurance(arr, k)-firstOccurance(arr, k))+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = countOccurances(arr,k);
		System.out.println(ans);
	}

}
