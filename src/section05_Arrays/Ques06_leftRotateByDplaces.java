package section05_Arrays;

import java.util.Scanner;

public class Ques06_leftRotateByDplaces {
	public static void reverse(int []arr,int start,int end) {
		while(start<=end) {
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	//reversal algorithm
	public static void leftRotateByDPlaces(int [] arr,int d) {
		d=d%arr.length();
		reverse(arr,0,d-1);
		reverse(arr,d,arr.length-1);
		reverse(arr,0,arr.length-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		leftRotateByDPlaces(arr,d);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
