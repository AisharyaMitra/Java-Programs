package tcs_nqt;

import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Elements of array are :-");
		for(int i = 0 ; i < n ; i++) {
			arr[i]=sc.nextInt();
		}
		int i1=0,i2=n-1,temp;
		for(int i = 0 ; i < n ; i++) {
		while(i2>i1) {
			temp=arr[i1];
			arr[i1]=arr[i2];
			arr[i2]=temp;
			i1++;
			i2--;
		}
	    }
		for(int i = 0 ; i < n ; i++) {
			System.out.println(arr[i]);
		}
	}

}
