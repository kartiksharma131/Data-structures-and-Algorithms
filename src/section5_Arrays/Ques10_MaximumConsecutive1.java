package section5_Arrays;

import java.util.Scanner;

public class Ques10_MaximumConsecutive1 {
	public static int maxConsecutive1(int [] arr) {
		int max1=0;
		int maxTillNow=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				maxTillNow++;
			}
			
			if(maxTillNow>max1) {
				max1=maxTillNow;
				maxTillNow=0;
			}
			
		}
		return max1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans=maxConsecutive1(arr);
		System.out.println(ans);
	}

}
