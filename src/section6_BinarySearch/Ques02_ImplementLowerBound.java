package section6_BinarySearch;

import java.util.Scanner;

public class Ques02_ImplementLowerBound {
	public static int lowerBound(int [] arr,int k) {
		int start = 0;
		int end = arr.length-1;
		int ans =-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]==k) {
				ans = mid;
				end=mid-1;
			}
			else if(arr[mid]>k) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return ans;
			
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
		int ans  = lowerBound(arr,k);
		System.out.println(ans);
	}

}
