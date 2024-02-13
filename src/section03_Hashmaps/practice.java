package section03_Hashmaps;

import java.util.HashMap;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> mapUse = new HashMap<>();
		mapUse.put("abc", 1);
		
		if(mapUse.containsKey("abc")) {
			System.out.println("has abc");
		}
		
		if(mapUse.containsKey("abc")) {
			int val = mapUse.get("abc");
			System.out.println(val);
		}
		
		if(mapUse.containsValue(1)) {
			System.out.println(mapUse.);
		}
		
		int val = mapUse.remove("abc");
		
		int size = mapUse.size(); 
	}

}
