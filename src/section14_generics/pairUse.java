package section14_generics;

public class pairUse {

	public static<T extends Object> void printArray(T arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]); 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pair<Integer> p1 = new pair<Integer>(10,20);
		p1.getFirst();
		p1.getSecond();
		
		pair<String> p2 = new pair<String>("ab","cd");
		p2.getFirst();
		p2.getSecond();
		
		Integer a[]= new Integer[10];
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
		}
		printArray(a);
		
		String a2[]=new String[10];
		for(int i=0;i<a2.length;i++) {
			a2[i]="abc";
		}
		
		printArray(a2);

	}

}
