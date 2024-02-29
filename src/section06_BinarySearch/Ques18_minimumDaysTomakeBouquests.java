package section06_BinarySearch;

import java.util.Scanner;

public class Ques18_minimumDaysTomakeBouquests {

	public static int smallest(int [] arr) {
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<ans) {
				ans=arr[i];
			}
			
		}
		return ans;
	}
	
	public static int largest(int [] arr) {
		int ans = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>ans) {
				ans=arr[i];
			}
		}
		return ans;
	}
	
	public static int bouquets(int [] arr,int k,int day) {
		int count=0;
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=day) {
				count++;
			}
			else {
				ans+=(count/k);
				count=0;
			}
		}
		
		return ans;
	}
	public static int minimunDaysToMakeBouquets(int [] arr,int m, int k) {
		int start = smallest(arr);
		int end=largest(arr);
		int mid = start+(end-start)/2;
		int ans=0;
		while(start<=end) {
			int possibleBouquets = bouquets(arr,k,mid);
			if(possibleBouquets==m) {
				ans=mid;
				end=mid-1;
			}
			else if(possibleBouquets>m) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
			mid= start+(end-start)/2;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n =scn.nextInt();
		int m = scn.nextInt();
		int k = scn.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		if(n<m*k) {
			System.out.println("not possible");
		}
		else {
			int ans = minimunDaysToMakeBouquets(arr,m,k);
			System.out.println(ans);
		}
		

	}

}
