 package section10_StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class miscQues03_insertAnElementAtBottomOfStack {
	public static void insertAtBottom(Stack<Integer> stack,int a) {
		if(stack.isEmpty()) {
			stack.push(a);
			return;
		}
		int temp=stack.peek();
		stack.pop();
		insertAtBottom(stack, a);
		stack.push(temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack  = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		insertAtBottom(stack,a);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
