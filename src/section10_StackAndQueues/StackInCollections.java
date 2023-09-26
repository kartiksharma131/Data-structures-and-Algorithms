package section10_StackAndQueues;

import java.util.Stack;

public class StackInCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack =new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.peek();
		stack.size();
		stack.push(30);
		while(!stack.isEmpty()) {
			stack.pop();
		}
	}

}
