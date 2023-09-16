package section07_Strings;

import java.util.Scanner;

public class miscQues07_returnNumberOfpallindromicSubstrings {
	public static boolean isPallindrome(String str) {
		int i=0;
		int j=str.length()-1;
		boolean ans=true;
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j)) {
				ans=false;
				break;
			}
			i++;
			j--;
		}
		return ans;
	}
	public static int countPallindromicSubstrings(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String substring = str.substring(i,j);
				//System.out.println(substring);
				if(isPallindrome(substring)) {
					count+=1;
				}
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int ans = countPallindromicSubstrings(str);
		System.out.println(ans);

	}

}
