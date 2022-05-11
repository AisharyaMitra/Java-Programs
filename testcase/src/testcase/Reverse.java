package testcase;

public class Reverse {

	public static void main(String[] args) {
		int n=345,r,rev=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			rev=(rev*10)+r;
		}
		System.out.println(rev);
	}

}
