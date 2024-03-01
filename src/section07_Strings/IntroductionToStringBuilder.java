package section07_Strings;

public class IntroductionToStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder("hello");
		str.append(" world");
		str.setCharAt(str.length()-1, '1');
		System.out.println(str);
		str.insert(str.length()-1, 'd');
		System.out.println(str);
		str.deleteCharAt(str.length()-1);
		System.out.println(str);
		String str1 = str.toString();
		
		System.out.println(str1);
	}

}
