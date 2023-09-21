package section09_BitManipulation;

import java.util.Scanner;

public class Ques09_noThatAppearOddNoOfTimes {
	public static int solution(int [] arr) {
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans=ans^arr[i];
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = solution(arr);
		System.out.println(ans);
	}

}
