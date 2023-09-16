package section07_Strings;

import java.util.Scanner;

public class miscQues04_printAllSubtrings {
	public static void printAllSubstrings(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str= scn.nextLine();
		printAllSubstrings(str);
	}

}
