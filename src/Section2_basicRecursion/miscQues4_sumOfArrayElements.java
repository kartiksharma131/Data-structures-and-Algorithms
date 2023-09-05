package Section2_basicRecursion;

import java.util.Scanner;

public class miscQues4_sumOfArrayElements {

	public static int sumOfArray(int [] arr) {
		if(arr.length==0) {
			return 0;
		}
		int [] smallArray = new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallArray[i-1]=arr[i];
		}
		int ans = arr[0]+sumOfArray(smallArray);
		return ans;
	}
	public static int sumOfArrayBetter(int [] arr,int startIndex) {
		if(startIndex>arr.length-1) {
			return 0;
		}
		int smallans = arr[startIndex]+sumOfArrayBetter(arr, startIndex+1);
		return smallans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = sumOfArray(arr);
		int ans2 =sumOfArrayBetter(arr, 0);
		System.out.println(ans);
		System.out.println(ans2);
	}

}
