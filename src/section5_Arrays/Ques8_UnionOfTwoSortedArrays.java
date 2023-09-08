package section5_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ques8_UnionOfTwoSortedArrays {
	public static ArrayList<Integer> union(int [] arr1,int []arr2){
		ArrayList<Integer> list = new ArrayList<>();
		int i=0;
		int j=0;
		while(i<arr1.length &&j<arr2.length) {
			if(arr1[i]==arr2[j]) {
				list.add(arr1[i]);
				i++;
				j++;
			}
			else if(arr1[i]>arr2[j]){
				list.add(arr2[j]);
				j++;
			}
			else {
				list.add(arr1[i]);
				i++;
			}
		}
		if(i==arr1.length) {
			while(j<arr2.length) {
				list.add(arr2[j]);
				j++;
			}
		}
		if(j==arr2.length) {
			while(i<arr1.length) {
				list.add(arr1[i]);
				i++;
			}
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int m=scn.nextInt();
		int [] arr1 =new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=scn.nextInt();
		}
		int [] arr2=new int[m];
		for(int i=0;i<m;i++) {
			arr2[i]=scn.nextInt();
		}
		ArrayList<Integer> list = union(arr1,arr2);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
