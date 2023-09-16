package section05_Arrays;

import java.util.Scanner;

public class Ques14_Sort012 {
	public static void sort012(int []arr) {
		int low=0;
		int mid=0;
		int high=arr.length-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				int temp=arr[mid];
				arr[mid]=arr[low];
				arr[low]=temp;
				low++;
				mid++;
			}
			else if(arr[mid]==1) {
				mid++;
			}
			else {
				int temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		sort012(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
