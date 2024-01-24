package section05_Arrays;

import java.util.Scanner;

public class Ques23_setMatrixZeros {
	
	public static void setRow(int [][]arr, int i,int m) {
		for(int j=0;j<m;j++) {
			if(arr[i][j]!=0) {
				arr[i][j]=-1;
			}
		}
	}
	
	public static void setCol(int [][]arr, int j,int n) {
		for(int i=0;i<n;i++) {
			if(arr[i][j]!=0) {
				arr[i][j]=-1;
			}
		}
	}
	public static void setMatrixZeros(int [][] arr, int n,int m) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]==0) {
					setRow(arr,i,m);
					setCol(arr,j,n);
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]==-1) {
					arr[i][j]=0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int m = scn.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		setMatrixZeros(arr,n,m);
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
