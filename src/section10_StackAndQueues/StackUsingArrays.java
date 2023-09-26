package section10_StackAndQueues;

public class StackUsingArrays {

	private int data[];
	private int top ;
	public StackUsingArrays() {
		data=new int[10];
		int top=-1;
	}
	public StackUsingArrays(int capacity) {
		data=new int[capacity];
		top=-1;
		
	}
	public  boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
		
	}
	public int size() {
		return top+1;
	}
	
	public int top() throws Exception {
		if(size()==0) {
			throw new Exception("stack is empty");
		}
		else {
			return data[top];
		}
	}
	
	public void push(int val) throws Exception {
		if(size()!=data.length) {
			
			top++;
			data[top]=val;
			
		}
		else {
			throw new Exception("stack is full");
		}
		
	}
	
	public int pop() throws Exception {
		if(size()==0) {
			throw new Exception("stack is empty");
		}
		else {
			int ans= data[top];
			data[top--]=0;
			return ans;
		}
		
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingArrays stack = new StackUsingArrays();
		stack.push(10);
		stack.push(20);
		System.out.println(stack.top());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		stack.push(30);
		System.out.println(stack.pop());
		System.out.println(stack.size());
	}

}
