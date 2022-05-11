package patterns;

public class Pattern7 {

	public static void main(String[] args) {
		int i,j,n=4;
		int k=1;
		for(i=1;i<=n;i++) {
			
			for(j=1;j<=i;j++) {
				
				System.out.print(k+"  ");
				k++;
			}
			System.out.println();
		}

	}

}
