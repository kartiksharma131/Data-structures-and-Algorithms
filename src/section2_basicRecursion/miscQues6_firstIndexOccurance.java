package section2_basicRecursion;

import java.util.Scanner;

public class miscQues6_firstIndexOccurance {
	public static int firstIndex(int [] arr,int startIndex,int k) {
		if(startIndex>=arr.length) {
			return -1;
		}
		if(arr[startIndex]==k) {
			return startIndex;
		}
		int smallAns = firstIndex(arr, startIndex+1, k);
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
		int ans = firstIndex(arr,0,k);
		System.out.println(ans);
	}

}
