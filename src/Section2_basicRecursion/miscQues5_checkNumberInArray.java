package Section2_basicRecursion;

import java.util.Scanner;

public class miscQues5_checkNumberInArray {
	
	public static boolean keyPresentOrNot(int [] arr,int k) {
		if(arr.length==0) {
			return false;
		}
		if(arr[0]==k) {
			return true;
		}
		else {
			int [] smallInput = new int[arr.length-1];
			for(int i=1;i<arr.length;i++) {
				smallInput[i-1]=arr[i];
			}
			boolean smallAns = keyPresentOrNot(smallInput, k);
			return smallAns;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k=scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		boolean ans = keyPresentOrNot(arr,k);
		if(ans) {
			System.out.println("key is present");
		}
		else {
			System.out.println("key not present");
		}
	}

}
