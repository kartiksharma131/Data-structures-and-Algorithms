package Section5_Arrays;

import java.util.Scanner;

public class Ques3_isArraySorted {

	public static boolean isArraySortedIterative(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static boolean isArraySortedRecursive(int [] arr,int start) {
		if(start>=arr.length-1) {
			return true;
		}
		if(arr[start]>arr[start+1]) {
			return false;
		}
		return isArraySortedRecursive(arr, start+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		boolean ansIterative = isArraySortedIterative(arr);
		boolean ansRecursive = isArraySortedRecursive(arr,0);
		if(ansIterative) {
			System.out.println("sorted");
		}
		else {
			System.out.println("not Sorted");
		}
		if(ansRecursive) {
			System.out.println("Sorted");
		}
		else {
			System.out.println("Not Sorted");
		}
	}

}
