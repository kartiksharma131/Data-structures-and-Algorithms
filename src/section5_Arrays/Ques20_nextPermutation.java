package section5_Arrays;

import java.util.Scanner;

public class Ques20_nextPermutation {
	public static void swap(int arr[],int i,int j) {
		int temp  =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void reverse(int arr[],int i,int j) {
		while(i<=j) {
			swap(arr,i,j);
			i++;
			j--;
		}
	}
	public static void nextPermutation(int [] arr) {
		if(arr.length==0||arr.length==1) {
			return;
		}
		int i=arr.length-2;
		while(i>=0 &&arr[i]>=arr[i+1]) {
			i--;
		}
		if(i>=0) {
			int j=arr.length-1;
			while(arr[i]>=arr[j]) {
				j--;
			}
			swap(arr,i,j);
		}
		reverse(arr,i+1,arr.length-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr =new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		nextPermutation(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
