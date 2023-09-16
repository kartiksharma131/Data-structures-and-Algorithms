package section05_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ques21_leadersinArray {
	public static ArrayList<Integer> leadersInArrayBrute(int [] arr){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length-1;i++) {
			boolean ans=false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					ans=true;
				}
			}
			if(!ans) {
				list.add(arr[i]);
			}
		}
		list.add(arr[arr.length-1]);
		return list;
	}
	public static ArrayList<Integer> leadersInArrayOptimal(int [] arr){
		ArrayList<Integer> list =new ArrayList<>();
		int max = arr[arr.length-1];
		list.add(arr[arr.length-1]);
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>max){
				list.add(arr[i]);
				max=arr[i];
			}
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		ArrayList<Integer> list = leadersInArrayBrute(arr);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
