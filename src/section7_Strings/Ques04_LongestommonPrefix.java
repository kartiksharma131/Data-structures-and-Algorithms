package section7_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Ques04_LongestommonPrefix {
	public static String longestCommonPrefix(String [] arr) {
		String ans ="";
		Arrays.sort(arr);
		String first=arr[0];
		String last = arr[arr.length-1];
		int n;
		if(first.length()>last.length()) {
			n=last.length();
		}
		else {
			n=first.length();
		}
		for(int i=0;i<n;i++) {
			if(first.charAt(i)==last.charAt(i)) {
				ans+=first.charAt(i);
			}
			else {
				break;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		String [] arr = new String[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.next();
		}
		String ans = longestCommonPrefix(arr);
		System.out.println(ans);
	}

}
