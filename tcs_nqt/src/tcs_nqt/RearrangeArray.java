package tcs_nqt;

import java.util.*;

public class RearrangeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Elements of array are :-");
		for(int i = 0 ; i < n ; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i = 0 ; i < n ; i++) {
		System.out.print(arr[i]+" ");
		}
	}

}
