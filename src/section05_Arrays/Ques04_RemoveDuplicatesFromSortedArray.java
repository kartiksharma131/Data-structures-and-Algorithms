package section05_Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ques04_RemoveDuplicatesFromSortedArray {
	public static ArrayList<Integer> removeDuplicates(int []arr){
		HashMap<Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
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
		ArrayList<Integer> list = removeDuplicates(arr);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
