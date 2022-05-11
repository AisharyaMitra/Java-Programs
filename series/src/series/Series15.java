package series;

import java.util.Scanner;

public class Series15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double a = sc.nextDouble();
		double i,s=0.0,p=1.0,r=-1.0;
		System.out.print("1"+" ");
		for(i=2.0;i<=n;i++) {
			s=s+(r*(Math.pow(i, i)/Math.pow(a, p)));
			if(i!=n) {
				if(r==-1.0) {
					if(p==1) {
				System.out.print("-"+" "+"("+(int)(i)+"^"+(int)(i)+")"+"/"+(int)a+" "+"+"+" ");
					}else {
				System.out.print("-"+" "+"("+(int)(i)+"^"+(int)(i)+")"+"/"+"("+(int)a+"^"+(int)p+")"+" "+"+"+" ");
					}
				}else {
				System.out.print("("+(int)(i)+"^"+(int)(i)+")"+"/"+"("+(int)a+"^"+(int)p+")"+" ");
				}
			}else {
				if(r==-1.0) {
					System.out.print("-"+" "+"("+(int)(i)+"^"+(int)(i)+")"+"/"+"("+(int)a+"^"+(int)p+")");
				}else {
					System.out.print("("+(int)(i)+"^"+(int)(i)+")"+"/"+"("+(int)a+"^"+(int)p+")");
				}
			}
			r=r*(-1);
			p++;
		}
		System.out.println();
		System.out.println(1.0+s);
	}

}
