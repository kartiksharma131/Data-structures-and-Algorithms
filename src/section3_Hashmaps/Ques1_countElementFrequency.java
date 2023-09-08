package section3_Hashmaps;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class Ques1_countElementFrequency {

	private static void frequency(int[] arr) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				int v = map.get(arr[i]);
				v++;
				map.put(arr[i], v);
			}
			else {
				map.put(arr[i], 1);
			}
			
		}
		Set<Integer> set = map.keySet();	
		for(Integer i : set) {
			System.out.println(i+" "+map.get(i));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		frequency(arr);

	}

	
}
