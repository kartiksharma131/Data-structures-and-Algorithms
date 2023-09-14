package section7_Strings;

import java.util.Scanner;

public class Ques02_ReverseWordsInString {
	public static String ReverseWords(String str) {
		String ans="";
		int i=str.length()-1;
		int j=i;
		while(i>=0) {
			if(str.charAt(i)==' ') {
				String smallAns = str.substring(i+1,j+1);
				ans+=smallAns;
				ans+=' ';
				i=i-1;
				j=i;
			}
			if(i==0) {
				String smallAns=str.substring(i,j+1);
				ans+=smallAns;
				break;
			}
			i--;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str= scn.nextLine();
		String ans = ReverseWords(str);
		System.out.println(ans);
	}

}
