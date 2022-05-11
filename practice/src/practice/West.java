package practice;

import java.util.Scanner;

public class West {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int []arr=new int[N];
		int i;
		for(i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<N;i++) {
			if(arr[i]<0) {
				System.out.println(arr[i]+" ");
			}
		}
	}

}
