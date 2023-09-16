package section05_Arrays;

import java.util.Scanner;

public class miscQues01_SwapAlternateElements {
	public static void swapAlternate(int [] arr) {
		if(arr.length==0||arr.length==1) {
			return ;
		}
		else {
			int n = arr.length/2;
			n=n*2;
			for(int i=0;i<n;i+=2) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		swapAlternate(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
