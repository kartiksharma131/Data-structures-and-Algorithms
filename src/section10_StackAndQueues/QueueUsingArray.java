package section10_StackAndQueues;

public class QueueUsingArray {

	private int data[];
	private int front;
	private int rear;
	private int size;
	public QueueUsingArray() {
		data = new int[10];
		front=-1;
		rear=-1;
		size=0;
		
	}
	public QueueUsingArray(int capacity) {
		data = new int[capacity];
		front=-1;
		rear=-1;
		size=0;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		return false;
	}
	public int front() throws Exception {
		if(size==0) {
			throw new Exception("Queue is Empty");
		}
		else {
			return data[front];
		}
	}
	public void enqueue(int value) throws Exception {
		if(size==0) {
			data[0]= value;
			size++;
			front=0;
			rear=0;
		}
		else if(size==data.length-1) {
			throw new Exception("Queue is full");
		}
		else {
			rear++;
			data[rear]=value;
			size++;
		}
	}
	public int dequeue() throws Exception {
		if(size==0) {
			throw new Exception("queue is empty");
		}
		
		else {
			int temp =data[front]; 
			front++;
			if(size==1) {
				front=-1;
				rear=-1;
			}
			size--;
			return temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
