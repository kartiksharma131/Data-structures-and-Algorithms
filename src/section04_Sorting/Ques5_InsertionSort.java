package section04_Sorting;

import java.util.Scanner;

public class Ques5_InsertionSort {
	public static void insertionSort(int [] arr) {
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int temp = arr[i];
			while(j>=0 &&arr[j]>temp ) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		insertionSort(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}
