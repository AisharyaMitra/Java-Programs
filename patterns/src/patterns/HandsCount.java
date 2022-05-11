package patterns;

import java.util.Scanner;

public class HandsCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=i;j<=5;j++) {
				System.out.println(i);
				i++;
				}
				}
	}

}
