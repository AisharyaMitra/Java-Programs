package testcase;

import java.util.Scanner;

public class ShapeArea {
	public void peri(double r) {
		System.out.println((2*3.14*r));
		}
		public void peri(double a , double b) {
		System.out.println((2*(a+b)));
	}
		public void area(double r) {
			System.out.println((2*3.14*r));
			}
			public void area(double a , double b) {
			System.out.println((2*(a+b)));
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 & 1 for perimeter of  circle");
		System.out.println("Enter 1 & 2 for area of  circle");
		System.out.println("Enter 2 & 1 for perimeter of  rectangle");
		System.out.println("Enter 2 & 2 for area of  rectangle");
		int d = sc.nextInt();
		int c = sc.nextInt();
		if(d==1 && c==1) {
			System.out.println("Enter value for radius:");
			double r = sc.nextDouble();
				ShapeArea s = new ShapeArea();
				s.peri(r);
			}
		else if(d==1 && c==2) {
				System.out.println("Enter value for radius:");
				double r = sc.nextDouble();
				ShapeArea s = new ShapeArea();
				s.area(r);
			}
		else if(d==2 && c==1) {
			System.out.println("Enter value for length and breadth:");
				double a = sc.nextDouble();
				double b = sc.nextDouble();
						ShapeArea s = new ShapeArea();
						s.peri(a,b);
			}
		else if(d==2 && c==2) {
				System.out.println("Enter value for length and breadth:");
				double a = sc.nextDouble();
				double b = sc.nextDouble();
						ShapeArea s = new ShapeArea();
						s.area(a,b);
			}
		else {

			throw new ArithmeticException("Not valid");
		}
	}
}
