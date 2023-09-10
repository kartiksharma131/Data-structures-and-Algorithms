package section6_BinarySearch;

import java.util.Scanner;

public class Ques05_floorAndceil {

	public static int searchPosition(int [] arr,int k) {
		int low=0;
		int high=arr.length-1;
		if(arr[0]>k) {
			return 0;
		}
		else if(arr[arr.length-1]<k) {
			return arr.length;
		}
		else {
			while(low<=high) {
				int mid = (low+high)/2;
				if(arr[mid]>=k &&arr[mid-1]<k) {
					return mid;
				}
				else if(arr[mid]<k) {
					low=mid+1;
				}
				else {
					high=mid-1;
				}
			}
		}
		return -1;
	}
	public static int floor(int [] arr,int k) {
		int index = (searchPosition(arr, k)-1);
		return arr[index];
	}
	public static int ceil(int [] arr,int k) {
		int index= searchPosition(arr, k);
		return arr[index];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int n=scn.nextInt();
		int k=scn.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans1 = floor(arr,k);
		int ans2=ceil(arr,k);
		System.out.println(ans1);
		System.out.println(ans2);
	}

}
