package series;

public class Series5 {

	public static void main(String[] args) {
		int n=5,i,j,sum=0;
		for(i=1;i<=n;i++) {
			int fact=1;
			for(j=1;j<=i;j++) {
				fact=fact*j;
			}
			sum=sum+fact;
		}
		System.out.println(sum);

	}

}
