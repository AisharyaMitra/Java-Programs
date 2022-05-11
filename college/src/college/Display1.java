package college;

import java.util.Scanner;

public class Display1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=0;
		for(int i=0;i<=n;i++) {
			if(i!=n) {
			System.out.print(k+","+k/2+",");
			}else {
				System.out.print(k+","+k/2);
			}
			k=k+2;
		}
	}

}
