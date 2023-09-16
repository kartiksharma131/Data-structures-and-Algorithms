package section04_Sorting;

import java.util.Scanner;

public class Ques4_SelectionSort {
	
	public static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int min= arr[i];
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(min>arr[j]) {
					min=arr[j];
					minIndex =j;
				}
			}
			if(minIndex!=i) {
				arr[minIndex]=arr[i];
				arr[i]=min;
			}
			 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
			
		}
		selectionSort(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
