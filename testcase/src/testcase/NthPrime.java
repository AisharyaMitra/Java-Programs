package testcase;

public class NthPrime {

	public static void main(String[] args) {
		/*int i,j,n=10,c;
		 for(i=2;i<=n;i++) {
		      c=0;
		         for(j=1;j<=i;j++){
		        	     if(i%j==0){
		        	         c++;
		        	     }
		         }
		          if(c==2) {
		             System.out.print(i+" ");
		         }
		     }*/
		
		int c=0,n=0,i=1,j=1;  
			while(n<15){  
				j=1;  
				c=0;  
				while(j<=i){  
					if(i%j==0)  
						c++;  
					j++;   
				}  
				if(c==2) {  
					System.out.print(i+" ");  
					n++;  
				}  
				i++;  
			}  
	}
}