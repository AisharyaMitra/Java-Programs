package testcase;
import java.util.Scanner;
public class Shape {
	public void peri(double r) {
		System.out.println((2*3.14*r));
	}
	public void peri(double a , double b) {
		System.out.println((2*(a+b)));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of shape:");
		System.out.println("Enter 1 for circle");
		System.out.println("Enter 2 for rectangle");
		int d = sc.nextInt();
		if(d==1) {
			System.out.println("Enter value for radius:");
			double r = sc.nextDouble();
				Shape s = new Shape();
				s.peri(r);
		}
		if(d==2) {
			System.out.println("Enter value for length and breadth:");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
					Shape s = new Shape();
					s.peri(a,b);
			}
		
	}
	

}
