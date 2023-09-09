package section5_Arrays;

import java.util.Scanner;

public class Ques18_BuyAndSellStocks {
	public static int buyAndSellStocks(int [] arr) {
		int minLeft=Integer.MAX_VALUE;
		int maxRight=Integer.MIN_VALUE;
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]<minLeft) {
				minLeft=arr[i];
			}
			if(arr[j]>maxRight) {
				maxRight=arr[j];
			}
			i++;
			j--;
		}
		return (maxRight-minLeft);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = buyAndSellStocks(arr);
		System.out.println(ans);

	}

}
