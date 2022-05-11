package series;

import java.util.Scanner;

public class Series8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s=3;
		System.out.print(s+" ");
		for(int i = 1; i<n;i++) {
			
			s=s+s;
			System.out.print(s+" ");
		}
		sc.close();
	}

}
