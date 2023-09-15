package section7_Strings;

import java.util.Scanner;

public class Ques06_isStringRotationOfAnother {
	public static StringBuilder rotateStringBy1(StringBuilder str2) {
		StringBuilder newString = new StringBuilder(str2);
		newString = newString.append(str2.charAt(0));
		newString =newString.deleteCharAt(0);
		return newString;
	}
	public static boolean isRotated(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		StringBuilder newString = new StringBuilder(str2);
		for(int i=0;i<str1.length();i++) {
			newString = rotateStringBy1(newString);
			if(str1.equals(newString.toString())) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str1=scn.next();
		String str2 = scn.next();
		boolean ans =isRotated(str1,str2);
		if(ans) {
			System.out.println("rotated");
		}
		else {
			System.out.println("not rotated");
		}
	}

}
