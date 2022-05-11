package testcase;

public class KrishnaMurti {

	public static void main(String[] args) {
		int n=145,i,r,temp,fact=1,sum=0;
		temp=n;
		while(n>0) {
			fact=1;
			r=n%10;
			n=n/10;
			i=r;
			System.out.println(i);
			System.out.println(n);
			System.out.println(r);
			while(i>0) {
				fact = fact*i;
				i--;
			}
			System.out.println( "fact ="+fact);
			sum=sum+fact;
			System.out.println("sum="+sum);
		}
		if(sum==temp) {
			System.out.println("krishna");
		}
		else {
		System.out.println("not");
		}

	}

}
