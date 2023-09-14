package section7_Strings;

import java.util.Scanner;

public class miscQues08_compressString {
	public static String compress(String str) {
		String ans ="";
		int count=1;
		
		char prev=str.charAt(0);
		ans+=str.charAt(0);
		for(int i=1;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==prev) {
				count++;
			}
			else {
				ans+=count;
				count=1;
				ans+=ch;
				prev=ch;
				
				
			}
			
		}
		ans+=count;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println("main");
		String ans = compress(str);
		System.out.println(ans);
	}

}
