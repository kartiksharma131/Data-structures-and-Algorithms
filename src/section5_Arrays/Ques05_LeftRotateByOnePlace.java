package section5_Arrays;

import java.util.Scanner;

public class Ques05_LeftRotateByOnePlace {
	public static void leftRotateByOne(int []arr) {
		int temp = arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr  =new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scn.nextInt();
		}
		leftRotateByOne(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
