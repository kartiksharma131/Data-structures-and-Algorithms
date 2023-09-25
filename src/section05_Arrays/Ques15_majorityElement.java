package section05_Arrays;

import java.util.Scanner;

public class Ques15_majorityElement {
	public static int majorityElement(int [] arr) {
		int count=0;
		int element=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				count++;
			}
			else if(count==0 && arr[i]!=element) {
				element=arr[i];
				count++;
			}
			else if(arr[i]!=element &count>0) {
				count--;
			}
		}
		return element;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
			
					
		}
		int ans = majorityElement(arr);
		System.out.println(ans);
	}

}
