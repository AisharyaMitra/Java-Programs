package patterns;

public class Swastik {

	public static void main(String[] args) {
		/*
		  
	
		 * 		 * * * * *
		 *		 *
		 *		 *
		 *		 *
		 * * * * * * * * *
		 		 *		 *
		 		 *		 *
		 		 *		 *
		 * * * * *	     *
		 
		  
		  
		  
		 */
		int n=4,i,j;
		for(i=1;i<=n;i++) {
			System.out.print("* ");
			for(j=(n-1);j>=1;j--) {
				System.out.print("# ");
			}
			System.out.print("*");
			for(j=(n-1);j>=1;j--) {
				System.out.print("# ");
			}
			/*for(j=(n-1);j>=1;j--) {
				System.out.print("# ");
			}*/
			System.out.println();
		}

	}

}
