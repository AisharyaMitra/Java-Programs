package testcase;

public class Case1 {

	public static void main(String[] args) {
		int i, fact=1;
		int number = 7;
		try {
		for(i=number; i>0;i--) {
			fact = fact*i;
		}
		}catch(ArithmeticException e) {
			System.out.println("exception occured");
		}
		System.out.println("Factorial is " + fact);

	}

}
