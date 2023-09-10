package section6_BinarySearch;

import java.util.Scanner;

public class Ques03_ImplementUpperBound {
	public static int upperBound(int [] arr,int k) {
		int low=0;
		int high = arr.length-1;
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int [] arr =new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans  =upperBound(arr,k);
		System.out.println(ans);
	}

}
