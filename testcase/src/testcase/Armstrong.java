package testcase;

public class Armstrong {

	public static void main(String[] args) {
		int n=153,i,r;
		double sum=0;
		int temp=n;
		i=0;
		while(n>0) {
			//r=n%10;
			n=n/10;
			i++;
		}
		n=temp;
		while(temp>0) {
			r=temp%10;
			temp=temp/10;
			double v= Math.pow(r, i);
			sum=sum+v;
			
		}
		
		if(sum==n) {
		System.out.println("Armstron number");
		}
		else {
			System.out.println("Not");
		}

	}

}
