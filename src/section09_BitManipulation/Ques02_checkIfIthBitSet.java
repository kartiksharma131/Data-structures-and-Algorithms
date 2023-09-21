package section09_BitManipulation;

import java.util.Scanner;

public class Ques02_checkIfIthBitSet {
	public static boolean checkIthSet(int n,int i) {
		int j=0;
		int m=1<<i;
		
		if((m&n)==0) {
			return false;
		}
		else {
			return true;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = scn.nextInt();
		boolean ans = checkIthSet(n,i);
		System.out.println(ans);
	}

}
