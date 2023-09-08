package section5_Arrays;

import java.util.Scanner;

public class Ques7_MoveZerosToEnd {
	public static void moveZerosToEnd(int [] arr) {
		int j=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				j=i;   //first occurance of 0
				break;
			}
		}
		if(j==-1) {
			return;
		}
		for(int i=j+1;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n= scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		moveZerosToEnd(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
