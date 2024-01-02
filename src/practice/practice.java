package practice;

import java.util.LinkedList;
import java.util.Scanner;

import section08_LinkedLists.miscQues01_TakeInputLinkedList;

public class practice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = Node.takeInput(); 
		// Node.printList(head);
		//System.out.println(Node.size(head));
		//Node<Integer> newHead = Node.deleteAtPosition(head,5);
		//int ans = Node.midPointOfll(head);
		head = Node.reverLLIteratively(head);
		Node.printList(head);
		
		
	}
	public static int majorityElement(int [] arr) {
		int count =0;
		int element = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				count++;
			}
			if(arr[i]!=element && count==0) {
				element =arr[i];
				count++;
			}
			if(arr[i]!=element) {
				count--;
			}
		}
		return element;
	}
	public static int maxSubarraySum(int [] arr) {
		int maxsum=Integer.MIN_VALUE;
		int currSum = 0;
		for(int i=0;i<arr.length;i++) {
			currSum = currSum+arr[i];
			if(currSum>maxsum) {
				maxsum=currSum;
			}
			if(currSum<0) {
				currSum=0;
			}
		}
		return maxsum;
	}
	public static int buyAndSellStocks(int arr []) {
		int minLeft = Integer.MAX_VALUE;
		int maxRight =Integer.MIN_VALUE;
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]<minLeft) {
				minLeft=arr[i];
			}
			if(arr[j]>maxRight) {
				maxRight= arr[j];
			}
			i++;
			j--;
		}
		return (maxRight-minLeft);
	}
	
	public static void leftRotateByDPlaces(int [] arr,int d) {
		int d = d%arr.length;
		reverse(arr,0,d-1);
		reverse(arr,d,arr.length-1);
		reverse(arr,0,arr.length-1);
	}
	
	public static void moveZerosToEnd(int [] arr) {
		
		int j=-1;
		for(int i=0;arr[i]!=0;i++) {
			j=i;
			break;
		}
		if(j==-1) {
			return ;
		}
		else {
			for(int i=j+1;i<arr.length-1;i++) {
				if(arr[i]!=0) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					j++;
				}
			}
		}
		
	}
			

}
