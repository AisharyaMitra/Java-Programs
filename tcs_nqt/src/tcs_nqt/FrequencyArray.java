package tcs_nqt;

import java.util.*;

public class FrequencyArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] arr = new boolean[n];
		System.out.println("Elements of array are :-");
		for(int i = 0 ; i < n ; i++) {
			arr[i]=sc.nextBoolean();
		}
		for(int i = 0 ; i < n ; i++) {
			if(arr[i]==true) {
				continue;
			}
			int count = 1;
			for(int j = i+1 ; j < n ; j++) {
				if(arr[i]==arr[j]) {
					arr[j]=true;
					count++;
				}
			}
			System.out.println(arr[i]+" "+count);
		}
	}

}
