package section07_Strings;

import java.util.Scanner;

public class miscQues01_countWords {
	public static int countWords(String str) {
		int ans=0;
		if(str.length()==0) {
			return 0;
		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				ans+=1;
			}
		}
		return ans+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int ans = countWords(str);
		System.out.println(ans);
	}

}
