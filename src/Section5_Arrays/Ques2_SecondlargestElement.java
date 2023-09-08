package Section5_Arrays;

import java.util.Scanner;

public class Ques2_SecondlargestElement {
	public static int secondLargest(int [] arr) {
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secMax = max;
				max=arr[i];
				
			}
			else if(arr[i]>secMax &&arr[i]<max) {
				secMax = arr[i];
			}
		}
		return secMax;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = secondLargest(arr);
		System.out.println(ans);
	}

}
