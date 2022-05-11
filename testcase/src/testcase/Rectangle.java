package testcase;



public class Rectangle {
	public void peri(int a,int b) {
		System.out.println((2*(a+b)));
	}
	public void peri(double a,double b) {
		System.out.println((2*(a+b)));
	}
	

	public static void main(String[] args) {
		Rectangle p = new Rectangle();
		p.peri(8.8, 9.9);
	}

}
