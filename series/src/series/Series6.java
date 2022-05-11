package series;

public class Series6 {

	public static void main(String[] args) {
		double n=2.0,a=1.0,i,j=0.0,p;
		double s=0.0;
		for(i=1;i<=n;i++) {
		j=(double)Math.pow(a, i);
		p=j/i;
		s=s+p;
		}
		System.out.println(s);
	}

}
