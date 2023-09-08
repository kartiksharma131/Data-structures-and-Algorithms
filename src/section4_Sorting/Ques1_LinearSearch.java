package section4_Sorting;

import java.util.Scanner;

public class Ques1_LinearSearch {
	public static int linearSearch(int [] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int [] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans =linearSearch(arr,k);
		System.out.println("element found at index "+ans);
	}

}
