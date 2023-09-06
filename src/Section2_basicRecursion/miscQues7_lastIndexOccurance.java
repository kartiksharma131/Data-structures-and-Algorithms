package Section2_basicRecursion;

import java.util.Scanner;

public class miscQues7_lastIndexOccurance {

	public static int lastIndex(int [] arr,int k,int endIndex) {
		if(endIndex<0) {
			return -1;
		}
		if(arr[endIndex]==k) {
			return endIndex;
		}
		int smallAns = lastIndex(arr, k, endIndex-1);
		return smallAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k= scn.nextInt();
		int [] arr =new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = lastIndex(arr,k,arr.length-1);
		System.out.println(ans);
	}

}
