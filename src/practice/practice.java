package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import section08_LinkedLists.miscQues01_TakeInputLinkedList;

public class practice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= scn.nextInt();
		}
		/*
				
		Boolean ans = isArraySorted(arr,0);
		if(ans) {
			System.out.println("Sorted");
		}
		else {
			System.out.println("not sorted");
		}
		
		
		ArrayList<Integer> list = removeDuplicates(arr);
		for(int i=0;i< list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		
		leftRotateByOnePlace(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		
		int d = scn.nextInt();
		leftRotateByDPlaces(arr,d);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		
		moveZerosToEnd(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		
		int k = scn.nextInt();
		boolean ans = linearSearch(arr,k);
		if(ans) {
			System.out.println("Element present");
		}
		else {
			System.out.println("Element not present");
		}
		
		
		
		int ans = findMissingNo(arr);
		System.out.println(ans);
		
		
		int ans = maxConsecutive1(arr);
		System.out.println(ans);
		
		
		int ans = noThatAppearOnce(arr);
		System.out.println(ans);
		
		
		int target = scn.nextInt();
		boolean ans = twoSum(arr,target);
		if(ans) {
			System.out.println("Pair Exists");
		}
		else {
			System.out.println("pair not found");
		}
		
		
		sort012(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		*/
		
		int ans = majorityElement(arr);
		System.out.println(ans);
		
	}
	public static boolean isArraySorted(int [] arr,int start) {
		if(arr.length==1) {
			return true;
		}
		if(start>=arr.length-1) {
			return true;
		}
		if(arr[start]>arr[start+1]) {
			return false;
		}
		return isArraySorted(arr,start+1);
	}
	
	public static ArrayList<Integer> removeDuplicates(int [] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++ ) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
				list.add(arr[i]);
			}
		}
		return list;
	}
	
	public static void leftRotateByOnePlace(int [] arr) {
		int temp = arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
	}
	
	public static void reverse(int [] arr,int start, int end) {
		while(start<=end) {
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	public static void leftRotateByDPlaces(int [] arr,int d) {
		d = d%arr.length;
		reverse(arr,0,d-1);
		reverse(arr,d,arr.length-1);
		reverse(arr,0,arr.length-1);
	}
			
	public static void moveZerosToEnd(int [] arr) {
		int j=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				j=i;
				break;
			}
		}
		if(j==-1) {
			return;
		}
		
		for(int i=j+1;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp = arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				j++;
			}
			
				
		}
	}
	
	public static boolean linearSearch(int [] arr,int k) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				return true;
			}
		}
		return false;
	}
	
	public static int findMissingNo(int arr[]) {
		int n = arr.length+1;
		int sum = (n*(n+1))/2;
		int sumOfArr =0;
		for(int i=0;i<arr.length;i++) {
			sumOfArr=sumOfArr+arr[i];
		}
		return (sum-sumOfArr);
	}
	
	public static int maxConsecutive1(int [] arr) {
		int count=0;
		int maxCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
			}
			if(arr[i]!=1 && count>maxCount) {
				maxCount=count;
				count=0;
			}
		}
		return maxCount;
	}
	
	public static int noThatAppearOnce(int [] arr) {
		int ans = 0;
		for(int i=0;i<arr.length;i++) {
			ans=ans^arr[i];
		}
		return ans;
	}
	
	public static boolean twoSum(int [] arr,int target) {
		Arrays.sort(arr);
		int i=0;
		int j= arr.length-1;
		while(i<j) {
			if(arr[i]+arr[j]==target) {
				return true;
			}
			else if(arr[i]+arr[j]>target) {
				j--;
			}
			else {
				i++;
			}
		}
		return false;
	}
	
	public static void swap(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
	}
	
	public static void sort012(int arr[]) {
		int low=0;
		int mid=0;
		int high = arr.length-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				swap(arr[low],arr[mid]);
				low++;
				mid++;
			}
			else if(arr[mid]==1) {
				mid++;
			}
			else {
				swap(arr[mid],arr[high]);
				high--;
			}
		}
	}
	
	public static int majorityElement(int [] arr) {
		int count =0;
		int element = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				count++;
			}
			else if(count ==0 && arr[i]!=element ) {
				element =arr[i];
				count++;
			}
			else if(arr[i]!=element && count >0) {
				count--;
			}
		}
		return element;
	}
	
	public static int kadane(int arr[]) {
		int curr=0;
		int maxi = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			curr=curr+arr[i];
			if(curr>maxi) {
				maxi=curr;
			}
			if(curr<0) {
				curr=0;
			}
		}
		return maxi;
	}
}
