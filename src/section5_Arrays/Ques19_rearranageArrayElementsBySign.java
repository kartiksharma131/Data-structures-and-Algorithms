package section5_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ques19_rearranageArrayElementsBySign {
	public static ArrayList<Integer> rearrange(int arr[]) {
		int positive=0;
		int negative=1;
		ArrayList<Integer> list = new ArrayList<>();
		int i=0;
		while(i<arr.length) {
			if(arr[i]>0) {
				list.set(positive, arr[i]);
				positive+=2;
			}
			else  {
				list.set(negative, arr[i]);
				negative+=2;
			}
			i++;
			
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		ArrayList<Integer> list =rearrange(arr);
		for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i));
		}
	}

}
