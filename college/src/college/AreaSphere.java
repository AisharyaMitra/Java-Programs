package college;

import java.util.Scanner;

public class AreaSphere {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		System.out.println("Surface area is"+(4*3.14*Math.pow(radius,2)));
		System.out.println("Surface volume is"+((4/3)*3.14*Math.pow(radius,3)));
	}

}
