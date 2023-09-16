package section05_Arrays;

import java.util.Scanner;

public class Ques11_noThatAppearsOnce {
	public static int noThatAppearOnce(int [] arr) {
		int xorr =0;
		for(int i=0;i<arr.length;i++) {
			xorr=xorr^arr[i];
		}
		return xorr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = noThatAppearOnce(arr);
		System.out.println(ans);
	}

}
