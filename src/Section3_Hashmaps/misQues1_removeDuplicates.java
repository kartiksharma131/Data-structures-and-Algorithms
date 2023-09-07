package Section3_Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class misQues1_removeDuplicates {
	public static ArrayList<Integer> removeDuplicates(int []arr){
		ArrayList<Integer> list= new ArrayList<>();
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				continue;
			}
			if(!map.containsKey(arr[i])) {
				
				list.add(arr[i]);
				map.put(arr[i], 1);
				
			}
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr =new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		ArrayList<Integer> ans = removeDuplicates(arr);
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i));
		}
		
	}

}
