package Section2_basicRecursion;

import java.util.Scanner;

public class Ques1_printNameNTimes {
	public static void printNameNTimes(int n) {
		if(n==0) {
			return;
		}
		
		//System.out.println("kartik"+n); 3->2->1
		printNameNTimes(n-1);
		System.out.println("kartik"+n); //1->2->3
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printNameNTimes(n);
	}

}
