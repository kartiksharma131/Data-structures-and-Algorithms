package section03_Hashmaps;

import java.util.HashMap;
import java.util.Set;

public class IntroductionToHashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("abc", 1);
		map.put("def", 2);
		map.put("ijk", 3);
		if(map.containsKey("abc")) {
			System.out.println("present");
			int v = map.get("abc");
			map.put("abc", v++);
			System.out.println(v);
		}
		if(map.containsValue(3)){
			System.out.println("present");
		}
		
		Set<String> str = map.keySet();
		for( String s :str) {
			System.out.println(s);
		}
		map.con
				
	}

}
