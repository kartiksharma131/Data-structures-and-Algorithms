package Section2_basicRecursion;

import java.util.Scanner;

public class miscQues9_countZeros {
	public static int countZeros(int n) {
		if(n==0) {
			return 0;
		}
		int ans = 0;
		if(n%10==0) {
			ans+=1;
			//ans=ans+countZeros(n/10);
		}
		ans=ans+countZeros(n/10);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int ans = countZeros(n);
		System.out.println(ans);
	}

}
