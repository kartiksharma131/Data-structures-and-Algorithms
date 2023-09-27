package section10_StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class miscQues01_reverseStringUsingStack {
	public static String reverseString(String str) {
		Stack<Character> stack = new Stack<>();
		StringBuilder ans=new StringBuilder("");
		for(int i=0;i<str.length();i++) {
			stack.push(str.charAt(i));
		}
		while(!stack.isEmpty()) {
			ans.append(stack.pop());
		}
		return ans.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String ans = reverseString(str);
		System.out.println(ans);
	}

}
