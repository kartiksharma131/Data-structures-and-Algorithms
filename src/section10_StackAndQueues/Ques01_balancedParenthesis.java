package section10_StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class Ques01_balancedParenthesis {
	public static boolean checkBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='['||str.charAt(i)=='{'|| str.charAt(i)=='(') {
				stack.push(str.charAt(i));
			}
			else if(str.charAt(i)==']'){
				if(stack.peek()=='['){
					stack.pop();
				}
				else {
					return false;
				}
			}
			else if(str.charAt(i)=='}'){
				if(stack.peek()=='{'){
					stack.pop();
				}
				else {
					return false;
				}	
			}
			else if(str.charAt(i)==')'){
				if(stack.peek()=='('){
					stack.pop();
				}
				else {
					return false;
				}
			}	
			
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		String str = scn.next();
		boolean ans = checkBalanced(str);
		if(ans) {
			System.out.println("balanced");
		}
		else {
			System.out.println("not balanced");
		}
	}

}
