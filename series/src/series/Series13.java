package series;

import java.util.Scanner;

public class Series13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double x = sc.nextDouble();
		double i,s=0.0,p=0.0,r=1.0;
		for(i=1;i<=n;i++) {
			p=p+((r)*(x/i));
			if(i!=n) {
				if(r==-1.0) {
				System.out.print("-"+" "+(int)(x)+"/"+(int)i+" "+"+"+" ");
				}else {
					System.out.print((int)(x)+"/"+(int)i+" ");
				}
			}else {
				if(r==-1.0) {
				System.out.print("-"+" "+(int)(x)+"/"+(int)i);
				}else {
					System.out.print((int)(x)+"/"+(int)i+" ");
				}
			}
			r=r*(-1);
		}
		System.out.println();
		System.out.println(p);
	}

}
