package section07_Strings;

import java.util.Scanner;

public class Ques03_LargestOddNoInString {
	public static String largestOddNo(String str) {
		int largest=0;
		boolean value=false;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				
				
				String smallString = str.substring(i,j);
				//52System.out.println(smallString);
				
				int no = Integer.parseInt(smallString);
				
				if(no%2==1 && no> largest) {
					largest = no;
				}
				
			}
		}
		if(largest==0) {
			return "";
		}
		String ans = Integer.toString(largest);
		return ans ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String ans = largestOddNo(str);
		System.out.println(ans);
	}

}
