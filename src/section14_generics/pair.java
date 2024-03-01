package section14_generics;

public class pair<T> {
	private T first;
	private T second;
	
	public pair(T first,T second){
		this.first=first;
		this.second=second;
	}
	
	public void setFirst(T first) {
		this.first = first;
	}
	
	public T getFirst() {
		return first;
	}
	
	public void setSecond(T second) {
		this.second = second;
	}
	
	public T getSecond() {
		return second;
	}
	
	

}
