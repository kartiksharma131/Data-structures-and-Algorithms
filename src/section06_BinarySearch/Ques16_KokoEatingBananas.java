package section06_BinarySearch;

import java.util.Scanner;

public class Ques16_KokoEatingBananas {
	public static int largestElement(int [] arr) {
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		return largest;
	}
	public static int hours(int [] arr,int mid) {
		int ans = 0;
		for(int i=0;i<arr.length;i++) {
			ans+= Math.ceil(arr[i]/mid);
		}
		return ans;
	}
	public static int koko(int [] arr,int limit) {
		int low=1;
		int high = largestElement(arr);
		int min = Integer.MAX_VALUE;
		while(low<=high) {
			int mid=(low+high)/2;
			int totalHours = hours(arr,mid);
			if(totalHours<=limit) {
				min = mid;
				high=mid-1;
			}
			else {
				low=mid+1;
			}
			
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int limit = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = koko(arr,limit);
		System.out.println(ans);
	}

}
