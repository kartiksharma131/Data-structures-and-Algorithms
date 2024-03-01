package section07_Strings;

import java.util.HashMap;
import java.util.Scanner;

public class practice {

	public static String reverseWords(String str) {
		String ans="";
		int i=str.length()-1;
		int j=i;
		while(j>0) {
			if(str.charAt(j)==' ') {
				ans=ans+ str.substring(j+1,i+1);
				ans+=' ';
				i=j-1;
			}
			j--;
		}
		ans+=str.substring(j,i+1);
		return ans;
	}
	
	public static String largestOddNo(String no) {
		int largest=0;
		for(int i=0;i<no.length();i++) {
			for(int j=i+1;j<=no.length();j++) {
				String smallNo = no.substring(i,j);
				int n  = Integer.parseInt(smallNo);
				if(n>largest && n%2==1) {
					largest=n;
				}
			}
		}
		if(largest==0) {
			return "";
		}
		else {
			return Integer.toString(largest);
		}
	}
	
	public static boolean isIsomorphic(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		HashMap<Character,Character> map = new HashMap<>();
		for(int i=0;i<str1.length();i++) {
			if(map.containsKey(str1.charAt(i))) {
				if(str2.charAt(i)!=map.get(str1.charAt(i))) {
					return false;
				}
			}
			else {
				map.put(str1.charAt(i), str2.charAt(i));
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		//String ans = reverseWords(str);
		
		boolean ans = isIsomorphic("egg","add");
		if(ans) {
			System.out.println("isomorphic");
		}
		else {
			System.out.println("not isomorphic");
		}
		
		
	}
}
