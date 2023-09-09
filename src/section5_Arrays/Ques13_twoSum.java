package section5_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ques13_twoSum {
	public static ArrayList<Integer> twoSum(int[] arr,int k){
		Arrays.sort(arr);
		ArrayList<Integer> list = new ArrayList<>();
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]+arr[j]==k) {
				list.add(i);
				list.add(j);
				i++;
			}
			else if(arr[i]+arr[j]>k) {
				j--;
			}
			else {
				i++;
			}
		}
		if(list.isEmpty()) {
			list.add(-1);
			list.add(-1);
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int k=scn.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		ArrayList<Integer> list = twoSum(arr, k);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
			if(i%2!=0) {
				
				System.out.println();
			}
		}
		
	}

}
