package college;

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,p,c=0;
		for(i=2;i<=n/2;i++) {
			if(n%i==0) {
				p=i;
				for(i=2;i<=p/2;i++) {
					if((p%i)==0) {
						c=1;
						if(c==0) {
							System.out.println(p);
						}
					}
			}
		}
	}
}
}