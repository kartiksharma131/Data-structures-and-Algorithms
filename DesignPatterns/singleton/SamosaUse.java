package singleton;

public class SamosaUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samosa s1 = Samosa.getSamosa();
		System.out.println(s1.hashCode());
		
		Samosa s2 = Samosa.getSamosa();
		System.out.println(s2.hashCode());
	}

}
