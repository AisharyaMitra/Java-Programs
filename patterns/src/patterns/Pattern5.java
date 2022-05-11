package patterns;

public class Pattern5 {

	public static void main(String[] args) {
		int i,j,n=5;
		
		for(i=n;i>=1;i--) {
			 for (j = 1; j <=i; j++) {
			        System.out.print(j+"  ");
			    }
			 for ( j = (i*2); j<=((n*2)-1); j++) {
			       
				 System.out.print("*  ");
			       
			    }
			 
			 for (j = i; j >=1 ; j--) {
			        System.out.print(j+"  ");
			    }
			 System.out.println();
		}

	}

}
