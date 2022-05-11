package series;

public class Series1 {

	public static void main(String[] args) {
		int n=7,i,sum=0;
		for(i=1;i<=n;i++) {
			if(i!=n) {
			System.out.print(i+" "+","+" ");
			}
			else {
				System.out.print(i);
			}
			sum=i+sum;
			
		}
		
		System.out.println();
		System.out.println(sum);

	}

}
