package testcase;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		int p=7,i,c=0;
		try {
			for(i=2;i<=p/2;i++) {
				if((p%i)==0) {
					c=1;
				}
			}
			} catch(ArithmeticException e) {
				System.out.println("exception occured");
		}
		if(c==0) {
			System.out.println("Prime Number");
		}else {
			System.out.println("not a prime");
		}

	}
}