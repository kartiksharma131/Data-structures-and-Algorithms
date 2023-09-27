package section10_StackAndQueues;

import java.util.Stack;

public class miscQues02_deleteMidElementFromStack {
	public static void deleteMiddle(Stack<Integer> stack) {
		int n;
		if(stack.size()%2==0) {
			 n= (stack.size()/2);
		}
		else {
			n=(stack.size()+1)/2;
		}
		
		Stack<Integer> temp = new Stack<>();
		while(stack.size()!=n) {
			temp.push(stack.pop());
		}
		stack.pop();
		while(!temp.isEmpty()) {
			stack.push(temp.pop());
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack  =new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		deleteMiddle(stack);
	}

}
