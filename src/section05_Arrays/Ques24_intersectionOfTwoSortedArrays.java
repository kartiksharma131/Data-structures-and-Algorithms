package section05_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ques24_intersectionOfTwoSortedArrays {

	public static ArrayList<Integer> intersectionOfSortedArrays(int [] arr1,int [] arr2){
		int i=0;
		int j=0;
		ArrayList<Integer> list = new ArrayList<>();
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]==arr2[j]&& list.size()==0) {
				list.add(arr1[i]);
				i++;
				j++;
			}
			else if(arr1[i]==arr2[j]&& list.get(list.size()-1)!=arr1[i]) {
				list.add(arr1[i]);
				i++;
				j++;
			}
			else if(arr1[i]>arr2[j]) {
				j++;
			}
			else {
				i++;
			}
		}
		return list;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int m = scn.nextInt();
		int [] arr1=new int[n];
		int [] arr2 = new int[m];
		for(int i=0;i<n;i++) {
			arr1[i]=scn.nextInt();
		}
		for(int i=0;i<m;i++) {
			arr2[i]=scn.nextInt();
		}
		ArrayList<Integer> ans = intersectionOfSortedArrays(arr1,arr2);
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i));
		}
		
	}

}
