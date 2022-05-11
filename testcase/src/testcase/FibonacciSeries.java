package testcase;

public class FibonacciSeries {
	

	public static void main(String[] args) {
		int n = 50;
		if(n==0) {
			throw new ArithmeticException("Not valid");
		}else {
		
		int a=0,b=1,c=0,i,sum=a+b;
		System.out.print(a+ " "+ b+" ");
		for(i=2;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
			sum=sum+c;
			System.out.print(c+ " ");
		}
		System.out.println(sum);
		}
		
	}

}
