package patterns;

public class Pattern3 {

	public static void main(String[] args) {
		int i,j,n=5;
		
		for(i=1;i<n;i++) {
			 for (j = n; j >=i; j--) {
			        System.out.print("*  ");
			    }
			 for ( j = 1; j<((i*2)-1); j++) {
			        System.out.print("   ");
			       
			    }
			 
			 for (j = n; j >=i ; j--) {
			        System.out.print("*  ");
			    }
			 System.out.println();
		}
		int spa = 2*(n-1);
		for ( i = 1; i <=n ; i++) {
		    
		    for (j = 1; j <=i ; j++) {
		        System.out.print("*  ");
		    }
		    for ( j = spa; j >=1 ; j--) {
		        System.out.print("   ");
		       
		    }
		    spa -=2;
		    for (j = 1; j <=i ; j++) {
		        System.out.print("*  ");
		    }
		    
		    System.out.println();

		}


	}

}
