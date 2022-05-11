package series;

import java.util.Scanner;

public class Series9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s=1;
		for(int i = 1;i<=n;i++) {
			int p=(int)Math.pow(s,2);
			System.out.print(p+" ");
			s=s+2;
		}

	}

}
