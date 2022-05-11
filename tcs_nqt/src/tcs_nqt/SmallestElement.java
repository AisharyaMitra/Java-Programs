package tcs_nqt;

import java.util.*;

public class SmallestElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Elements of array are :-");
		for(int i = 0 ; i < n ; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("The second smallest element in array is: " + arr[1]+"The second largest element in array is: " + arr[n-2]);
//		int min = arr[0];
//		for(int i = 1 ; i < arr.length ; i++) {
//			if(min>arr[i]) {
//				min = arr[i];
//			}
//		}
//		System.out.println("Smallest number is:-"+" "+min);
	}
	
}
