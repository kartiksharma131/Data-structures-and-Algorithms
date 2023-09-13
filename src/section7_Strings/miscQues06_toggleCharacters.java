package section7_Strings;

import java.util.Scanner;

public class miscQues06_toggleCharacters {
	public static String toggleCharacters(String str) {
		StringBuilder sol = new StringBuilder(str);
		int i=0;
		while(i<sol.length()) {
			int ascii = (int)sol.charAt(i);
			if(ascii>=65 && ascii<=90) {
				ascii +=32;
				char ch = (char)ascii;
				sol.setCharAt(i, ch);
			}
			else if(sol.charAt(i)==' ') {
				i++;
			}
			else {
				ascii-=32;
				char ch = (char)ascii;
				sol.setCharAt(i, ch);
			}
			i++;
		}
		return sol.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String ans = toggleCharacters(str);
		System.out.println(ans);
	}

}
