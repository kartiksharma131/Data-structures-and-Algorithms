package section07_Strings;

import java.util.Scanner;

public class miscQues03_printAllPrefixesOfString {
	public static void printAllPrefixes(String str) {
		
		for(int i=1;i<=str.length();i++) {
			System.out.println(str.substring(0, i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		printAllPrefixes(str);
		

	}

}
