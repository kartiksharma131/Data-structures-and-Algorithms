package section5_Arrays;

import java.util.*;
import java.util.Scanner;

public class Ques22_LongestConsecutiveSequence {
	public static int longestConsecutiveSequence(int [] arr) {
		Set<Integer> set = new HashSet<>();
		int count=0;
		int longest=1;
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		for(int itr : set) {
			if(!(set.contains(itr-1))){
				count=1;
				int x=itr;
				while(set.contains(x+1)) {
					count++;
					x=x+1;
				}
				longest = Math.max(longest, count);
			}
		}
		
		return longest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int [] arr =new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = longestConsecutiveSequence(arr);
		System.out.println(ans);
	}

}
