package section07_Strings;

public class IntroductionToStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcdefgh";
		System.out.println(str.charAt(1));
		System.out.println(str.length());
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7));
		System.out.println(str.contains("cde"));
		System.out.println(str);
		str= str +"abc";
		System.out.println(str);;
		System.out.println(str.concat("def"));
		System.out.println(str);
		String str1 = "abc";
		String str2 = "abc";
		if(str1.equals(str2)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
	}

}
