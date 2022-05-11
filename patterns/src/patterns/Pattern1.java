package patterns;

public class Pattern1 {

	public static void main(String[] args) {
		int i,j,n=5;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(i=n-1;i>=1;i--) {
		for(j=i;j>=1;j--) {
			System.out.print("*");
		}
		System.out.println();

		}
	}

}
