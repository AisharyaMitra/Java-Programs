package testcase;

public class HwSeries {

	public static void main(String[] args) {
		int n=10,a=1,b=0,i;
		System.out.print(a+ " ");
		for(i=1;i<n;i++) {
			b=a+i;
			a=b;
			
			System.out.print(b+ " ");
		}
	}

}
