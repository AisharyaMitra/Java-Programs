package practice;

import java.util.Scanner;

public class Pixel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0,p=1;
		while(num!=0) {
			int r = num%2;
			num = num/2;
			sum = sum+(r*p);
			p=p*10;
		}
		System.out.println(sum);
	}

}
